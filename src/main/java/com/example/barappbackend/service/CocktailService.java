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
    
    public Cocktail saveCocktail(Cocktail cocktail) {
        return cocktailRepository.save(cocktail);
    }
    
    public void deleteCocktail(Long id) {
        cocktailRepository.deleteById(id);
    }
    
    public void deleteAll() {
        cocktailRepository.deleteAll();
    }

    // @Autowired
    // public void deleteById(Long id) {
    //     // Vérifie d'abord si le cocktail existe
    //     Optional<Cocktail> cocktailOptional = cocktailRepository.findById(id);
    //     if (cocktailOptional.isPresent()) {
    //         // Supprime le cocktail s'il existe
    //         cocktailRepository.deleteById(id);
    //     } else {
    //         throw new RuntimeException("Cocktail not found with id: " + id);
    //     }
    // }

}

// public interface CocktailService {

//     Cocktail createCocktail (Cocktail cocktail);

//     List<Cocktail> read();

//     Cocktail updateCocktail(Long id , Cocktail cocktail);

//     String deleteCocktail(Long id);

    

