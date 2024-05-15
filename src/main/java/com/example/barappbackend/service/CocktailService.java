package com.example.barappbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.barappbackend.model.Cocktail;
import com.example.barappbackend.repository.CocktailRepository;

@Service
public class CocktailService {

    @Autowired
    private CocktailRepository cocktailRepository;

    public List<Cocktail> getAllCocktails() {
        List<Cocktail> cocktails = (List<Cocktail>) cocktailRepository.findAll();
        return cocktails;
    }

    public void deleteAll() {
        cocktailRepository.deleteAll();
    }

    public Cocktail saveCocktail(Cocktail cocktail) {
        return cocktailRepository.save(cocktail);
    }
    
}
