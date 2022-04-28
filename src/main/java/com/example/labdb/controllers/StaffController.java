package com.example.labdb.controllers;

import com.example.labdb.models.Staff;
import com.example.labdb.models.User;
import com.example.labdb.service.StaffService;
import com.example.labdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/staff")
public class StaffController {

    private StaffService staffService;
    private UserService userService;

    @Autowired
    public StaffController(StaffService staffService, UserService userService) {
        this.staffService = staffService;
        this.userService = userService;
    }

    @GetMapping("/add")
    public String addStaff(Model model){
        return "addStaff";
    }

    @GetMapping("/add/new")
    public String newStaff(Model model){
        return "addNewStaff";
    }

    @PostMapping("/add/new")
    public String addNewStaff(@RequestParam String birthday, @RequestParam String fullName,
                              @RequestParam String email, @RequestParam(name = "phone") String phoneNumber,
                              @RequestParam(name = "position") String position, Model model) throws ParseException {
        Date date;
        if (birthday.hashCode() != 0){
            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
            date = parser.parse(birthday);}
        else {
            date = null;
        }
        User user = new User(date, email, fullName, Long.parseLong(phoneNumber));
        Staff staff = new Staff(fullName, position, user);
        userService.addNewUser(user);
        staffService.addNewStaff(staff);
        return "addNewStaff";
    }

    @GetMapping("/add/existing")
    public String existingStaff(Model model){
        return "addExistingStaff";
    }

    @PostMapping("/add/existing")
    public String addExistingStaff(@RequestParam(name = "phone") String phoneNumber,
                                @RequestParam String position , Model model){
        User user = userService.getUserByPhone(Long.parseLong(phoneNumber));
        Staff staff = new Staff(user.getFullName(), position, user);
        staffService.addNewStaff(staff);
        return "addExistingStaff";
    }

    @GetMapping("/list")
    public String editStaff(Model model){
        List<Staff> staffs = staffService.getAllStaff();
        model.addAttribute("staffs", staffs);
        return "staffList";
    }
}
