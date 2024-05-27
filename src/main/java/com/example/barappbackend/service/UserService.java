package com.example.barappbackend.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.barappbackend.model.User;
import com.example.barappbackend.repository.UserRepository;


@Service
public class UserService {

    @Autowired  
    private UserRepository userRepository;

    
    // private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public void saveUser(User user) {
        // user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
    public boolean authenticateUser(String username, String password) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return password.equals(user.getPassword());
        }
        return false;
    }
     public List<User> getAllUsers() {
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }
}
