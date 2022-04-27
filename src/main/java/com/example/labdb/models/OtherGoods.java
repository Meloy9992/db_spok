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
    @Column(name = "id_goods")
    private Long id;

    @Column(name = "count_goods")
    private Integer countGoods;

    @Column(name = "name_goods")
    private String nameGoods;

    @Column(name = "price_goods")
    private Long priceGoods;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_manufacturer")
    private Manufacturer manufacturerGoods;
}
