package Task.Management.app.models.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditModel implements Serializable {
    @CreationTimestamp
    @Column(name = "create_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false, updatable = false)
    @CreatedDate
    private Date createAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_at", nullable = false)
    @LastModifiedBy
    private Date updateAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "delete_at", nullable = false)
    private Date deleteAt;

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public void setDeleteAt(Date deleteAt) {
        this.deleteAt = deleteAt;
    }
}
