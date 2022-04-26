package com.example.labdb.controllers;

import com.example.labdb.dao.StaffDao;
import com.example.labdb.dao.UserDao;
import com.example.labdb.models.User;
import com.example.labdb.models.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class MainController {
    private StaffDao staff;
    private UserDao user;

    @Autowired
    public MainController(StaffDao staff, UserDao user) {
        this.staff = staff;
        this.user = user;
    }

    @GetMapping("/deleteStaff")
    public String deleteStaff(Model model){
        Staff staffStaffById = staff.getStaffById(1L);
        staff.deleteStaff(staffStaffById);
        model.addAttribute("Deleted");
        return "staff";
    }

    @GetMapping("/addStaff")
    public String addStaff(Model model){
        User user1 = new User(new Date(1997-06-24), "testbd.db@mail.com", "Васюткин Иван Павлович", 89992223331L);
        Staff staff1 = new Staff("Васюткин Иван Павлович", "официант", user1);
        user.addNewUser(user1);
        staff.addNewStaff(staff1);
        model.addAttribute("add");
        return "add";
    }
}
