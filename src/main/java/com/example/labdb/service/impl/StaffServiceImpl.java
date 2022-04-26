package com.example.labdb.service.impl;


import com.example.labdb.dao.StaffDao;
import com.example.labdb.models.Staff;
import com.example.labdb.service.StaffService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class StaffServiceImpl implements StaffService {

    private StaffDao staffDao;

    @Autowired
    public StaffServiceImpl(StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    @Override
    public Staff addNewStaff(Staff staff){
        return staffDao.addNewStaff(staff);
    }

    @Override
    public void updateStaff(Staff staff){
        staffDao.updateStaff(staff);
    }

    @Override
    public void deleteStaff(Staff staff){
        staffDao.deleteStaff(staff);
    }

    @Override
    public Staff getStaffById(Long id){
        return staffDao.getStaffById(id);
    }
}
