package com.example.labdb.dao.impl;


import com.example.labdb.dao.KindDao;
import com.example.labdb.models.Kind;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class KindDaoImpl implements KindDao {

    @Override
    public Kind addNewKind(Kind kind){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(kind);
        session.getTransaction().commit();
        session.close();
        return kind;
    }

    @Override
    public void updateKind(Kind kind){

    }

    @Override
    public void deleteKind(Kind kind){

    }
}
