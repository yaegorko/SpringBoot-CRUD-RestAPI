package com.example.springbootrest.dao;

import com.example.springbootrest.entity.User;

import java.util.List;

public interface UserDAO {
    void addNewUser(User user);
    User getUserUserById(long id);
    User getUserByName(String name);
    void updateUser(User user);
    List<User> getAllUsers();
    void deleteUserById(long id);
    void truncateUserTable();
}
