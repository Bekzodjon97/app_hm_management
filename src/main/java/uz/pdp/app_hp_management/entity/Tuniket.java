package uz.pdp.app_hp_management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tuniket {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private boolean comeOrOut;// true kirgan, false chiqqan

    @ManyToOne(optional = false)
    private User user;

    @Column(nullable = false,updatable = false)
    @CreatedDate
    private Date date;
}
