package com.example.labdb.service;


import com.example.labdb.models.Staff;

import java.util.List;

public interface StaffService {

    Staff addNewStaff(Staff staff);

    void updateStaff(Staff staff);

    void deleteStaff(Staff staff);

    Staff getStaffById(Long id);

    List<Staff> getAllStaff();
}
