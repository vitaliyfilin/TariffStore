package com.example.cachetask.service;

import com.example.cachetask.model.User;

import java.util.List;


public interface UserService {
    public List<User> listUsers();

    public void postUser(User user);
}

