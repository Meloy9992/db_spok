package com.example.labdb.service;

import com.example.labdb.models.Dish;
import com.example.labdb.models.Ingredients;

import java.util.List;

public interface IngredientsService {

    Ingredients addNewIngredient(Ingredients ingredient);

    void updateIngredient(Ingredients ingredient);

    void deleteIngredient(Ingredients ingredients);

    List<Dish> searchIngredients(Ingredients ingredients);

}
