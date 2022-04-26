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
@Table(name= "ingredients")
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingredients")
    private Long id;

    @Column(name = "name_ingredients")
    private String nameIngredients;


        @OneToMany(mappedBy = "ingredients")
    private List<CompositionDish> compositionDishList;
}
