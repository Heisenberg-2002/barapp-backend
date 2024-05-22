package com.example.barappbackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.barappbackend.model.User;

// @RestController
// @RequestMapping("/v1/users")
// public class UserController {
    
//     // Create
//     // update
//     // Delete




//     @PostMapping("/auth")
//     public ResponseEntity <User> authenticateUser(@RequestBody User user) {
//        if (Credentials.getUsername().equals("bite") && user.getPassword().equals("poil")) {
//         return new ResponseEntity("tu es bien authentifié", HttpStatus.OK);
//        }
//        return new ResponseEntity(HttpStatus.CONFLICT);
//     }
// }

// @RestController
// @RequestMapping("/v1/users")
// public class UserController {
    
//     // Authentifier l'utilisateur
//     @PostMapping("/auth")
//     public ResponseEntity<String> authenticateUser(@RequestBody User user) {
//         // Vos identifiants statiques
//         String username = "utilisateur";
//         String password = "motdepasse";
        
//         // Vérifier les identifiants de l'utilisateur
//         if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
//             return ResponseEntity.ok("L'utilisateur est authentifié avec succès !");
//         } else {
//             return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Identifiants incorrects.");
//         }
//     }
// }

@CrossOrigin
@RestController
@RequestMapping("/v1/users")
public class UserController {
    


    // Authentifier l'utilisateur
    @PostMapping("/auth")
    public ResponseEntity<String> authenticateUser(@RequestBody User user) {
        // Vos identifiants statiques
        String username = "utilisateur";
        String password = "motdepasse";
        
        // Vérifier les identifiants de l'utilisateur
        if (user.getUsername().equals("arthur") && user.getPassword().equals("salut")) {
            return ResponseEntity.ok("L'utilisateur est authentifié avec succès !");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Identifiants incorrects.");
        }
    }
}