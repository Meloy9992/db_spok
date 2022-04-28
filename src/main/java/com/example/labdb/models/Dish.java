package com.example.labdb.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "dish")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISH")
    private Long id;

    @Column(name = "count_dish")
    private Integer countDish;

    @Column(name = "name_dish")
    private String nameDish;

    @Column(name = "price_dish")
    private Long priceDish;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_manufacturer")
    private Manufacturer manufacturer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_group")
    private Kind kindDish;

}
