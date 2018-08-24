package com.example.springbootrest.service;

import com.example.springbootrest.entity.Role;

public interface RoleService {
    void addRole(Role role);
    void truncateAllRoles();
}
