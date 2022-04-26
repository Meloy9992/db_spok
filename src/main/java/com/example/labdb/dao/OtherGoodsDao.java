package com.example.labdb.dao;


import com.example.labdb.models.OtherGoods;

public interface OtherGoodsDao {

    OtherGoods addNewOtherGoods(OtherGoods otherGoods);

    void updateOtherGoods(OtherGoods otherGoods);

    void deleteOtherGoods(OtherGoods otherGoods);
}
