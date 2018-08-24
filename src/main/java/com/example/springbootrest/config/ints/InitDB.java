package com.example.springbootrest.config.ints;


import com.example.springbootrest.entity.Role;
import com.example.springbootrest.entity.User;
import com.example.springbootrest.service.RoleService;
import com.example.springbootrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.Set;

public class InitDB {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Bean
    public void init() {

        Role adminRole = new Role("ADMIN");
        Role userRole = new Role("USER");

        roleService.addRole(adminRole);
        roleService.addRole(userRole);

        Set<Role> adminSetRoles = new HashSet<>();
        adminSetRoles.add(adminRole);
        Set<Role> userSetRoles = new HashSet<>();
        userSetRoles.add(userRole);

        User admin = new User("admin", "admin", adminSetRoles);
        User user = new User("user", "user", userSetRoles);

        userService.add(admin);
        userService.add(user);
    }
}
