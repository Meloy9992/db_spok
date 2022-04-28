package com.example.labdb.dao.impl;

import com.example.labdb.dao.UserDao;
import com.example.labdb.models.Dish;
import com.example.labdb.models.Staff;
import com.example.labdb.models.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public User addNewUser(User user){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public void updateUser(User user){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteUser(User user){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        if (user.getStaff().size() == 0){
            session.delete(user);
        }else {
            session.delete(user.getStaff().get(0));
            session.delete(user);
        }
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public User findUserById(Long id) {
        Session session = getSessionFactory().openSession();
        List<User> user = (List<User>) session.createQuery("from User where id = " + id).list();
        session.close();
        return user.get(0);
    }

    @Override
    public User getUserByPhone(Long phone) {
        Session session = getSessionFactory().openSession();
        List<User> user = (List<User>) session.createQuery("from User where phone = " + phone).list();
        session.close();
        return user.get(0);
    }

    @Override
    public List<User> getAllUser() {
        Session session = getSessionFactory().openSession();
        return session.createQuery("SELECT u FROM User u", User.class).getResultList();
    }
}
