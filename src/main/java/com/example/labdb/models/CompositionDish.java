package com.example.labdb.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "composition_dish")
public class CompositionDish implements Serializable {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_DISH")
    private Dish dish;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_ingredients")
    private Ingredients ingredients;

    private Integer grams;


}
