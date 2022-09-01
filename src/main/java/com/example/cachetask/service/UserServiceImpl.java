package com.example.cachetask.service;

import com.example.cachetask.model.User;
import com.example.cachetask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public void postUser(User user) {
        userRepository.save(user);
    }
}
