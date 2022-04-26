package com.example.labdb.service;

import com.example.labdb.models.User;

public interface UserService {

    User addNewUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User getUserById(Long id);
}
