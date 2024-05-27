package com.example.barappbackend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.barappbackend.model.User;
import com.example.barappbackend.service.UserService;


@CrossOrigin
@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

   
        @GetMapping
         public ResponseEntity<List<User>> getAllUsers() {
            List<User> users = userService.getAllUsers();
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
    
}








// @CrossOrigin
// @RestController
// @RequestMapping("/v1/users")
// public class UserController {
    
//     // Authentifier l'utilisateur
//     @PostMapping("/auth")
//     public ResponseEntity<User> authenticateUser(@RequestBody User user) {
//         // Vos identifiants statiques
        
//         // Vérifier les identifiants de l'utilisateur
//         if (user.getUsername().equals("arthur") && user.getPassword().equals("salut")) {
//             user.setToken("bonjour");
//             return ResponseEntity.ok(user);
//         } else {
//             return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//         }
//     }
// }
