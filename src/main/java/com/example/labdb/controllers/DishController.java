package com.example.labdb.controllers;

import com.example.labdb.models.Dish;
import com.example.labdb.models.Kind;
import com.example.labdb.models.Manufacturer;
import com.example.labdb.service.DishService;
import com.example.labdb.service.KindService;
import com.example.labdb.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/dish")
public class DishController {

    private DishService dishService;
    private ManufacturerService manufacturerService;
    private KindService kindService;

    @Autowired
    public DishController(DishService dishService, ManufacturerService manufacturerService, KindService kindService) {
        this.dishService = dishService;
        this.manufacturerService = manufacturerService;
        this.kindService = kindService;
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

    @GetMapping("/add")
    public String addDish(Model model){
        model.addAttribute("manufacturer", manufacturerService.getAllManufacturer());
        model.addAttribute("kind", kindService.getAllGroup());
        return "addDish";
    }

    @PostMapping("/add")
    public String addDishes(@RequestParam int countDish, @RequestParam String nameDish,
            @RequestParam Long priceDish, @RequestParam("kind") String groupId, @RequestParam("manufacturer") String manufacturerId, Model model){
       Manufacturer manufacturer = manufacturerService.getFromId(Integer.parseInt(manufacturerId));
       Kind kind = kindService.getFromId(Integer.parseInt(groupId));
        Dish dish = new Dish(countDish, nameDish, priceDish, manufacturer, kind);
        dishService.addNewDish(dish);
        return "addDish";
    }
}
