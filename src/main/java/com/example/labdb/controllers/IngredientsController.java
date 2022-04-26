package com.example.labdb.controllers;

import com.example.labdb.models.Ingredients;
import com.example.labdb.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/ingredients")
public class IngredientsController {

    private IngredientsService ingredientsService;

    @Autowired
    public IngredientsController(IngredientsService ingredientsService) {
        this.ingredientsService = ingredientsService;
    }

    @GetMapping("/add")
    public String addIngredients(Model model){
        return "addIngredients";
    }

    @PostMapping("/add")
    public String addIngredient(@RequestParam String name, Model model){
        Ingredients ingredients = new Ingredients();
        ingredients.setNameIngredients(name);
        ingredientsService.addNewIngredient(ingredients);
        return "addIngredients";
    }
}
