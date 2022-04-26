package com.example.labdb.service;


import com.example.labdb.models.OtherGoods;

public interface OtherGoodsService {

    OtherGoods addNewOtherGoods(OtherGoods otherGoods);

    void updateOtherGoods(OtherGoods otherGoods);

    void deleteOtherGoods(OtherGoods otherGoods);
}
