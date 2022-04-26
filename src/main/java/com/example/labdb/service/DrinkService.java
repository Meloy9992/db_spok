package com.example.labdb.service;

import com.example.labdb.models.Drink;

public interface DrinkService {

    Drink addNewDrink(Drink drink);

    void updateDrink(Drink drink);

    void deleteDrink(Drink drink);
}
