package com.example.labdb.dao.impl;

import com.example.labdb.dao.IngredientsDao;
import com.example.labdb.models.CompositionDish;
import com.example.labdb.models.Dish;
import com.example.labdb.models.Ingredients;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    @Override
    public List<Dish> searchIngredients(Ingredients ingredients) {
        Session session = getSessionFactory().openSession();
        Query query = session.createQuery("from Dish d inner join CompositionDish cd on d.id = cd.dish.id " +
                "inner join Ingredients ingredients on cd.ingredients.id = ingredients.id " +
                "where ingredients.nameIngredients = :param ");
        query.setParameter("param", ingredients.getNameIngredients());
        List<Object[]> results = query.getResultList();
        List<Dish> dishes = new ArrayList<>();

        for (int i=0; i <results.size(); i++){
            Object[] objects = results.get(i);
            Dish dish = (Dish) objects[0];
            dishes.add(dish);
        }

        session.close();
        return dishes;
    }

}
