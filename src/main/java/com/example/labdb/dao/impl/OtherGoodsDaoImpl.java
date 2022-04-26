package com.example.labdb.dao.impl;


import com.example.labdb.dao.OtherGoodsDao;
import com.example.labdb.models.OtherGoods;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class OtherGoodsDaoImpl implements OtherGoodsDao {

    @Override
    public OtherGoods addNewOtherGoods(OtherGoods otherGoods){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(otherGoods);
        session.getTransaction().commit();
        session.close();
        return otherGoods;
    }

    @Override
    public void updateOtherGoods(OtherGoods otherGoods){

    }

    @Override
    public void deleteOtherGoods(OtherGoods otherGoods){

    }
}
