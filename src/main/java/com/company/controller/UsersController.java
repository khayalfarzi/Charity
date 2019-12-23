package com.company.controller;

import com.company.entity.UsersEntity;
import com.company.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("user")
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    @GetMapping("/{id}")
    public Optional<UsersEntity> findById(@PathVariable("id") long id) {
        return userService.findById(id);
    }

    public void insertUser(UsersEntity entity) {
        userService.insertUser(entity);
    }

    public Iterable<UsersEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    public void deleteUserById(Long id) {
        userService.deleteUserById(id);
    }

    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }
}
