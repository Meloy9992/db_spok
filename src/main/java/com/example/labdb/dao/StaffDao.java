package com.example.labdb.dao;


import com.example.labdb.models.Staff;
import com.example.labdb.models.User;

import java.util.List;

public interface StaffDao {

    Staff addNewStaff(Staff staff);

    void updateStaff(Staff staff);

    void deleteStaff(Staff staff);

    Staff getStaffById(Long id);

    List<Staff> getAllStaff();
}
