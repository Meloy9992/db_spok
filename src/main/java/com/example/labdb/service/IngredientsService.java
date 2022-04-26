package com.example.labdb.service;

import com.example.labdb.models.Ingredients;

public interface IngredientsService {

    Ingredients addNewIngredient(Ingredients ingredient);

    void updateIngredient(Ingredients ingredient);

    void deleteIngredient(Ingredients ingredients);

}
