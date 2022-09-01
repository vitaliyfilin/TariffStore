package com.example.cachetask.controller;

import com.example.cachetask.model.User;
import com.example.cachetask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getUsers", produces = MediaType.APPLICATION_XML_VALUE)
   // @GetMapping(value = "/getUsers", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<User> getUsers() {
        return userService.listUsers();
    }

    @PostMapping("/createUser")
    public void createUser(User user) {
        userService.postUser(user);
    }
}
