package com.example.labdb.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "staff", schema = "public")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_staff")
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    private String position;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private User user;


    public Staff(String fullName, String position, User user) {
        this.fullName = fullName;
        this.position = position;
        this.user = user;
    }
}