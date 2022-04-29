package com.example.labdb.dao;

import com.example.labdb.models.Dish;

import java.util.List;

public interface DishDao {

    Dish addNewDish(Dish dish);

    void updateDish(Dish dish);

    void deleteDish(Dish dish);

    List<Dish> getAllDish();

    Dish findById(Long id);

    List<Dish> getListCategory(String category);

    Dish getExpensiveDish();
}
