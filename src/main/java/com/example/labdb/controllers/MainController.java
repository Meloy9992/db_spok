package com.example.labdb.controllers;

import com.example.labdb.models.Staff;
import com.example.labdb.service.StaffService;
import com.example.labdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private StaffService staff;
    private UserService user;

    @GetMapping("/")
    public String deleteStaff(Model model){
        return "home";
    }
}
