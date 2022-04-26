package com.example.labdb.dao;

import com.example.labdb.models.Dish;

public interface DishDao {

    Dish addNewDish(Dish dish);

    void updateDish(Dish dish);

    void deleteDish(Dish dish);
}
