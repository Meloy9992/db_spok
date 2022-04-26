package com.example.labdb.dao.impl;

import com.example.labdb.dao.DrinkDao;
import com.example.labdb.models.Drink;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class DrinkDaoImpl implements DrinkDao {

    @Override
    public Drink addNewDrink(Drink drink){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(drink);
        session.getTransaction().commit();
        session.close();
        return drink;
    }

    @Override
    public void updateDrink(Drink drink){

    }

    @Override
    public void deleteDrink(Drink drink){

    }
}
