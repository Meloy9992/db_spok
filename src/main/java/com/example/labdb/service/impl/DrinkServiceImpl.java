package com.example.labdb.service.impl;

import com.example.labdb.dao.DrinkDao;
import com.example.labdb.models.Drink;
import com.example.labdb.service.DrinkService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class DrinkServiceImpl implements DrinkService {

    private DrinkDao drinkDao;

    @Autowired
    public DrinkServiceImpl(DrinkDao drinkDao) {
        this.drinkDao = drinkDao;
    }

    @Override
    public Drink addNewDrink(Drink drink){
        return drinkDao.addNewDrink(drink);
    }

    @Override
    public void updateDrink(Drink drink){
        drinkDao.updateDrink(drink);
    }

    @Override
    public void deleteDrink(Drink drink){
    drinkDao.deleteDrink(drink);
    }
}
