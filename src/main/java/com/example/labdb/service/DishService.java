package com.example.labdb.service;

import com.example.labdb.models.Dish;

import java.util.List;

public interface DishService {

    Dish addNewDish(Dish dish);

    void updateDish(Dish dish);

    void deleteDish(Dish dish);

    List<Dish> getAllDish();

    Dish findById(Long id);
}
