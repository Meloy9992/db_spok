package com.example.labdb.dao;

import com.example.labdb.models.User;

public interface UserDao {

    User addNewUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User getUserById(Long id);

    User getUserByPhone(Long phone);
}
