package com.example.barappbackend.model;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Cocktails")
@Getter
@Setter
public class Cocktail {

    public Cocktail() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cocktail_id")
    private Long id;

    @Column(length = 100)
    private String name;

    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "price_s")
    private BigDecimal priceS;

    @Column(name = "price_m")
    private BigDecimal priceM;

    @Column(name = "price_l")
    private BigDecimal priceL;

    // @ManyToMany(fetch = FetchType.LAZY)
    // @JoinTable(name = "Cocktails_Categories",
    //         joinColumns = @JoinColumn(name = "cocktail_id"),
    //         inverseJoinColumns = @JoinColumn(name = "category_id"))
    // private Set<Category> categories;

    // Getters and setters
}
