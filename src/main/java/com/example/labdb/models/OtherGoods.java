package com.example.labdb.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "other_goods")
public class OtherGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer countGoods;

    private String nameGoods;

    private Long priceGoods;

    @ManyToOne(cascade = CascadeType.ALL)
    private Manufacturer manufacturerGoods;
}
