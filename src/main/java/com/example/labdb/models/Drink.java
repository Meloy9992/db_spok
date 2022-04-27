package com.example.labdb.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "drink")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_drink")
    private Long id;

    @Column(name = "count_drink")
    private Integer countDrink;

    @Column(name = "name_drink")
    private String nameDrink;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_manufacturer")
    private Manufacturer manufacturerDrink;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_group")
    private Kind kindDrink;
}
