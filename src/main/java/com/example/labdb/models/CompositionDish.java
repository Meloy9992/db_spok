package com.example.labdb.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "composition_dish")
public class CompositionDish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngredients;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDish;

    private Integer grams;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_DISH")
    private Dish dish;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_INGREDIENTS")
    private Ingredients ingredients;
}
