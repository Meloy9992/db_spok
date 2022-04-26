package com.example.labdb.service.impl;


import com.example.labdb.dao.OtherGoodsDao;
import com.example.labdb.models.OtherGoods;
import com.example.labdb.service.OtherGoodsService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class OtherGoodsServiceImpl implements OtherGoodsService {

    private OtherGoodsDao otherGoodsDao;

    @Autowired
    public OtherGoodsServiceImpl(OtherGoodsDao otherGoodsDao) {
        this.otherGoodsDao = otherGoodsDao;
    }

    @Override
    public OtherGoods addNewOtherGoods(OtherGoods otherGoods){
        return otherGoodsDao.addNewOtherGoods(otherGoods);
    }

    @Override
    public void updateOtherGoods(OtherGoods otherGoods){
        otherGoodsDao.updateOtherGoods(otherGoods);
    }

    @Override
    public void deleteOtherGoods(OtherGoods otherGoods){
        otherGoodsDao.deleteOtherGoods(otherGoods);
    }
}
