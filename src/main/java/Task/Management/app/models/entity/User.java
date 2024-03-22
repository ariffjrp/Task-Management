package Task.Management.app.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
@Entity
@Table(name = "users",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
    }
)
public class User extends AuditModel{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column( updatable = false, nullable = false)
    private UUID id;

    private String email;

    private String password;

    private String repeatPassword;

    private String provider;

    private String imageURL;

    private ERole role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.REMOVE)
    @JsonManagedReference
    @JsonIgnoreProperties("user")
    private Account account;
}
