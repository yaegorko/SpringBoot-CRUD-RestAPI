package com.example.springbootrest.service;

import com.example.springbootrest.dao.RoleDAO;
import com.example.springbootrest.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDAO roleDAO;

    @Override
    public void addRole(Role role) {
        roleDAO.addRole(role);
    }

    @Override
    public void truncateAllRoles() {
        roleDAO.truncateAllRoles();
    }
}
