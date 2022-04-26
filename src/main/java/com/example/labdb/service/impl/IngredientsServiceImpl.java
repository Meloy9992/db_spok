package com.example.labdb.service.impl;

import com.example.labdb.dao.IngredientsDao;
import com.example.labdb.models.Ingredients;
import com.example.labdb.service.IngredientsService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class IngredientsServiceImpl implements IngredientsService {

    private IngredientsDao ingredientsDao;

    @Autowired
    public IngredientsServiceImpl(IngredientsDao ingredientsDao) {
        this.ingredientsDao = ingredientsDao;
    }

    @Override
    public Ingredients addNewIngredient(Ingredients ingredients){
    return ingredientsDao.addNewIngredient(ingredients);
    }

    @Override
    public void updateIngredient(Ingredients ingredient){
        ingredientsDao.updateIngredient(ingredient);
    }

    @Override
    public void deleteIngredient(Ingredients ingredients){
    ingredientsDao.deleteIngredient(ingredients);
    }

}
