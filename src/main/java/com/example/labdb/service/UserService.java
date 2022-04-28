package com.example.labdb.service;

import com.example.labdb.models.User;

import java.util.List;

public interface UserService {

    User addNewUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User findUserById(Long id);

    User getUserByPhone(Long phone);

    List<User> getAllUser();
}
