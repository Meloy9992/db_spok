package com.example.labdb.dao.impl;

import com.example.labdb.dao.IngredientsDao;
import com.example.labdb.models.Ingredients;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class IngredientsDaoImpl implements IngredientsDao {

    @Override
    public Ingredients addNewIngredient(Ingredients ingredients){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(ingredients);
        session.getTransaction().commit();
        session.close();
        return ingredients;
    }

    @Override
    public void updateIngredient(Ingredients ingredient){

    }

    @Override
    public void deleteIngredient(Ingredients ingredients){

    }

}
