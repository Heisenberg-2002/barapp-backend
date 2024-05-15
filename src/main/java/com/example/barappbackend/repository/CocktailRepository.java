package com.example.barappbackend.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.barappbackend.model.Cocktail;

public interface CocktailRepository extends CrudRepository<Cocktail , Long> {
    
}
