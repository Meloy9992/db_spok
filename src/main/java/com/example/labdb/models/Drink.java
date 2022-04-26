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
    private Long id;

    private Integer countDrink;

    private String nameDrink;

    @ManyToOne(cascade = CascadeType.ALL)
    private Manufacturer manufacturerDrink;

    @ManyToOne(cascade = CascadeType.ALL)
    private Kind kindDrink;
}
