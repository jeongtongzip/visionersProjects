package com.example.visioners.service;

import com.example.visioners.model.User;
import com.example.visioners.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerNewUser(User user) {
        // Here you can add additional logic before saving the user
        return userRepository.save(user);
    }
}