package com.example.barappbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.barappbackend.model.Cocktail;
import com.example.barappbackend.service.CocktailService;

@Controller
@RestController
@CrossOrigin
@RequestMapping("/v1/cocktails")
public class CocktailController {

    @Autowired
    private CocktailService cocktailService;

    @PostMapping
    public ResponseEntity<Cocktail> createCocktail(@RequestBody Cocktail cocktail) {
        Cocktail createCocktail = cocktailService.saveCocktail(cocktail);
        return new ResponseEntity<>(createCocktail, HttpStatus.CREATED);
    }

    @GetMapping("all")
    public ResponseEntity<List<Cocktail>> getAllCocktails() {
        List<Cocktail> cocktails = cocktailService.getAllCocktails();
        return new ResponseEntity<>(cocktails, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Cocktail> getCocktail(@RequestParam String name) {
        return new ResponseEntity<>(new Cocktail(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Cocktail> getCocktail2(@PathVariable String name) {
        return new ResponseEntity<>(new Cocktail(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCocktail(@PathVariable Long id) {
        cocktailService.deleteCocktail(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } 
}
