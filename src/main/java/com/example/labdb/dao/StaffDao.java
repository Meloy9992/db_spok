package com.example.labdb.dao;


import com.example.labdb.models.Staff;

public interface StaffDao {

    Staff addNewStaff(Staff staff);

    void updateStaff(Staff staff);

    void deleteStaff(Staff staff);

    Staff getStaffById(Long id);
}
