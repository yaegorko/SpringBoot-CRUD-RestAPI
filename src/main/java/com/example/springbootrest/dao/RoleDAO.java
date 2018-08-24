package com.example.springbootrest.dao;

import com.example.springbootrest.entity.Role;

public interface RoleDAO {
    void addRole(Role role);
    void truncateAllRoles();
}
