package com.hrapau.docker.controllers;

import com.hrapau.docker.model.User;
import com.hrapau.docker.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    public UserController(UserService userService) {
        this.userService = userService;
    }

    private final UserService userService;

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }
}
