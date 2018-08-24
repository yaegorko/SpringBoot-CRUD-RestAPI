package com.example.springbootrest.service;

import com.example.springbootrest.dao.UserDAO;
import com.example.springbootrest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void add(User user) {
        userDAO.addNewUser(user);
    }

    @Override
    public User getById(long id) {
        return userDAO.getUserUserById(id);
    }

    @Override
    public User getByName(String name) {
        return userDAO.getUserByName(name);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void deleteUser(long id) {
        userDAO.deleteUserById(id);
    }

    @Override
    public void truncateUserTable() {
        userDAO.truncateUserTable();
    }
}
