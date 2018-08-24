package com.example.springbootrest.service;

import com.example.springbootrest.entity.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User getById(long id);
    User getByName(String name);
    void updateUser(User user);
    List<User> getAllUsers();
    void deleteUser(long id);
    void truncateUserTable();
}
