package com.example.barappbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.barappbackend.model.Cocktail;

@Repository
public interface CocktailRepository extends CrudRepository<Cocktail , Long> {
    
}
