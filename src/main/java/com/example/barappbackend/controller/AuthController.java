package com.example.barappbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.barappbackend.model.User;
import com.example.barappbackend.service.UserService;
@Controller
@CrossOrigin
@RestController
@RequestMapping("/v1/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.ok("Utilisateur inscrit avec succès");
    }

    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser(@RequestBody User user) {
        boolean authenticated = userService.authenticateUser(user.getUsername(), user.getPassword());
        if (authenticated) {
            return ResponseEntity.ok("token_fkzfpozefpzaeofkfopzfpozefpozef;pz;fpz;fepzef");
        } else {
            return ResponseEntity.status(401).body("Erreur lors de l'authentification");
        }
    }
}