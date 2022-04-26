package com.example.labdb.dao.impl;

import com.example.labdb.dao.UserDao;
import com.example.labdb.models.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

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
        session.createQuery("DELETE FROM User WHERE fullName = " + user.getFullName());
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public User getUserById(Long id) {
        Session session = getSessionFactory().openSession();
        List<User> user = (List<User>) session.createQuery("from User where id = " + id).list();
        session.close();
        return user.get(0);
    }
}
