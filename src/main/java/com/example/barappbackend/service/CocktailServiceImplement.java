// package com.example.barappbackend.service;

// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.example.barappbackend.model.Cocktail;
// import com.example.barappbackend.repository.CocktailRepository;

// import lombok.AllArgsConstructor;


// @Service
// @AllArgsConstructor
// public class CocktailServiceImplement implements CocktailService {

//     private final CocktailRepository cocktailRepository ;

//     @Override
//     public Cocktail createCocktail(Cocktail cocktail) {
//         // TODO Auto-generated method stub
//         return cocktailRepository.save(cocktail);
//     }

//     @Override
//     public List<Cocktail> read() {
//         // TODO Auto-generated method stub
//         return (List<Cocktail>) cocktailRepository.findAll();
//     }

//     @Override
//     public Cocktail updateCocktail(Long id, Cocktail cocktail) {
//         // TODO Auto-generated method stub
//         return cocktailRepository.findById(id)
//         .map(c->{
//             c.setPriceS(c.getPriceS());
//             c.setPriceM(c.getPriceM());
//             c.setPriceL(c.getPriceL());
//             c.setName(cocktail.getName());
//             c.setDescription(cocktail.getDescription());
//             return cocktailRepository.save(c);
//         }).orElseThrow(() -> new RuntimeException("Cocktail non trouvé"));
//     }

//     @Override
//     public String deleteCocktail(Long id) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'deleteCocktail'");
//     }
    
// }
