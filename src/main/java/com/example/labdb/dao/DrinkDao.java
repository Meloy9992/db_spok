package com.example.labdb.dao;

import com.example.labdb.models.Drink;

public interface DrinkDao {

    Drink addNewDrink(Drink drink);

    void updateDrink(Drink drink);

    void deleteDrink(Drink drink);
}
