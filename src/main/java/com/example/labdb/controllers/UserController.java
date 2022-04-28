package com.example.labdb.controllers;

import com.example.labdb.models.Dish;
import com.example.labdb.models.User;
import com.example.labdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public String editUser(Model model){
        List<User> users = userService.getAllUser();
        model.addAttribute("users",users);
        return "userList";
    }

    @GetMapping("/edit/{id}")
    public String editUsers(@PathVariable("id") long id, Model model){
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        return "userEdit";
    }

    @PostMapping("/edit")
    public String editUser(User user){
        userService.updateUser(user);
        return "redirect:/user/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteUsers(@PathVariable("id") long id, Model model){
        User user = userService.findUserById(id);
        userService.deleteUser(user);
        return "redirect:/user/list";
    }

    @GetMapping("/add")
    public String existingStaff(Model model){
        return "addUser";
    }

    @PostMapping("/add")
    public String addExistingStaff(@RequestParam String birthday, @RequestParam String fullName,
                                   @RequestParam String email, @RequestParam(name = "phone") String phoneNumber,
                                   Model model) throws ParseException {
        Date date;
        if (birthday.hashCode() != 0){
            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
            date = parser.parse(birthday);}
        else {
            date = null;
        }
        User user = new User(date, email, fullName, Long.parseLong(phoneNumber));
        userService.addNewUser(user);
        return "addUser";
    }
}
