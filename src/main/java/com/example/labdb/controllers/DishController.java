package com.example.labdb.controllers;

import com.example.labdb.models.Dish;
import com.example.labdb.models.Kind;
import com.example.labdb.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/dish")
public class DishController {

    private DishService dishService;

    @Autowired
    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/list")
    public String editDish(Model model){
        List<Dish> dishes = dishService.getAllDish();
        model.addAttribute("dishes", dishes);
        return "dishList";
    }

    @GetMapping("/edit/{id}")
    public String editDishes(@PathVariable("id") long id, Model model){
        Dish dish = dishService.findById(id);
        model.addAttribute("dish", dish);
        return "dishEdit";
    }

    @PostMapping("/edit")
    public String editDish(Dish dish){
        dishService.updateDish(dish);
        return "redirect:/dish/list";
    }

    @GetMapping("/kind")
    public String searchKind(Model model){
        return "desertList";
    }

    @PostMapping("/kind")
    public String searchingKind(@RequestParam("kind") String kind, Model model){
        List<Dish> dishes = dishService.getListCategory(kind);
        model.addAttribute("deserts", dishes);
        return "desertList";
    }

    @GetMapping("/expensive")
    public String getExpensiveDish(Model model){
        Dish dish = dishService.getExpensiveDish();
        model.addAttribute("dishes", dish);
        return "expensiveDish";
    }
}
