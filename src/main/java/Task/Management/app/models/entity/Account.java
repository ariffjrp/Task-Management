package Task.Management.app.models.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Account extends AuditModel{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column( updatable = false, nullable = false)
    private UUID id;

    private String name;

    private String nation;

    private LocalDate dob;

    private String phone;

    @JsonBackReference
    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;
}
