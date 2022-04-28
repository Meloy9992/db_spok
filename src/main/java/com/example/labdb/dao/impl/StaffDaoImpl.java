package com.example.labdb.dao.impl;


import com.example.labdb.dao.StaffDao;
import com.example.labdb.models.Staff;
import com.example.labdb.models.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import java.util.List;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class StaffDaoImpl implements StaffDao {

    @Override
    public Staff addNewStaff(Staff staff){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(staff);
        session.getTransaction().commit();
        session.close();
        return staff;
    }

    @Override
    public void updateStaff(Staff staff){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(staff);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteStaff(Staff staff){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.createQuery("delete from Staff where fullName = " + staff.getFullName());
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Staff getStaffById(Long id){
        Session session = getSessionFactory().openSession();
        Staff staff = (Staff) session.createQuery("from Staff where id = " + id).list().get(0);
        session.close();
        return staff;
    }

    @Override
    public List<Staff> getAllStaff() {
        Session session = getSessionFactory().openSession();
        return session.createQuery("SELECT s FROM Staff s", Staff.class).getResultList();
    }
}
