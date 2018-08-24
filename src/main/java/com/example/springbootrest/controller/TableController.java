package com.example.springbootrest.controller;

import com.example.springbootrest.entity.User;
import com.example.springbootrest.service.RoleService;
import com.example.springbootrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TableController {

    private final UserService userService;

    private final RoleService roleService;

    @Autowired
    public TableController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("/api")
    public ResponseEntity<List<User>> returnAllUser() {
        List<User> list = userService.getAllUsers();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/api/{id}")
    public ResponseEntity<User> returnUserById(@PathVariable("id") String id) {
        User user = userService.getById(Long.parseLong(id));
        return ResponseEntity.ok(user);
    }

    @PostMapping("/api")
    public ResponseEntity<User> addNewUser(@RequestBody User user) {
        userService.add(user);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/api")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/api")
    public boolean deleteUser(@RequestBody User user) {
        if (user.equals(userService.getById(user.getId()))) {
            userService.deleteUser(user.getId());
            return true;
        } else {
            return false;
        }
    }

    @DeleteMapping("/api/deleteall")
    public boolean deleteAllUsers() {
        userService.truncateUserTable();
        roleService.truncateAllRoles();
        return true;
    }
}
