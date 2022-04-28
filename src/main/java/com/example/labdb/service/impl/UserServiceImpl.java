package com.example.labdb.service.impl;

import com.example.labdb.dao.UserDao;
import com.example.labdb.models.User;
import com.example.labdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User addNewUser(User user){
        return userDao.addNewUser(user);
    }

    @Override
    public void updateUser(User user){
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user){
        userDao.deleteUser(user);
    }

    @Override
    public User findUserById(Long id) {
        return userDao.findUserById(id);
    }

    @Override
    public User getUserByPhone(Long phone){return userDao.getUserByPhone(phone);}

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
