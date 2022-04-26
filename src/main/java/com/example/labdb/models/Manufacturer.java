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
@Table(name= "manufacturer")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameManufacturer;

    @OneToMany(mappedBy = "manufacturerGoods")
    private List<OtherGoods> otherGoodsList;

    @OneToMany(mappedBy = "manufacturerDrink")
    private List<Drink> drinkList;
}
