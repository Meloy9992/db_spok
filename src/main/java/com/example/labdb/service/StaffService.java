package com.example.labdb.service;


import com.example.labdb.models.Staff;

public interface StaffService {

    Staff addNewStaff(Staff staff);

    void updateStaff(Staff staff);

    void deleteStaff(Staff staff);

    Staff getStaffById(Long id);
}
