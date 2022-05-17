package com.example.labdb.dao.impl;


import com.example.labdb.dao.KindDao;
import com.example.labdb.models.Dish;
import com.example.labdb.models.Kind;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public Kind getFromId(int id) {
        Session session = getSessionFactory().openSession();
        Kind kind = (Kind) session.createQuery("Select g FROM Kind g WHERE g.id = " + id).list().get(0);
        session.close();
        return kind;
    }

    @Override
    public List<Kind> getAllGroup() {
            Session session = getSessionFactory().openSession();
            List<Kind> list = session.createQuery("SELECT g FROM Kind g", Kind.class).getResultList();
            session.close();
            return list;
        }
}
