package com.example.labdb.dao;

import com.example.labdb.models.Ingredients;

public interface IngredientsDao {

    Ingredients addNewIngredient(Ingredients ingredient);

    void updateIngredient(Ingredients ingredient);

    void deleteIngredient(Ingredients ingredients);

}
