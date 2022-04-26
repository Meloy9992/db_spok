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
@Table(name= "kind")
public class Kind {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameGroup;

    @OneToMany(mappedBy = "kindDish")
    private List<Dish> dishList;

    @OneToMany(mappedBy = "kindDrink")
    private List<Drink> drinkList;

}
