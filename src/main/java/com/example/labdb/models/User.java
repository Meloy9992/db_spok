package com.example.labdb.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String email;

    @Column(name = "full_name")
    private String fullName;

    private Long phone;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Staff> staff;

    public User(Date birthday, String email, String fullName, Long phone) {
        this.birthday = birthday;
        this.email = email;
        this.fullName = fullName;
        this.phone = phone;
    }
}
