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

    private Integer countDish;

    private String nameDish;

    private Long priceDish;

    @OneToMany(mappedBy = "dish")
    private List<CompositionDish> compositionDishList;

    @ManyToOne(cascade = CascadeType.ALL)
    private Manufacturer manufacturer;

    @ManyToOne(cascade = CascadeType.ALL)
    private Kind kindDish;

}
