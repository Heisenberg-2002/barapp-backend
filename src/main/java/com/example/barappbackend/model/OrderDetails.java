package com.example.barappbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "orders_details")
public class OrderDetails {
    
    public OrderDetails() {};

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "order_details_id")
private Long orderDetailId;

@ManyToOne
@JoinColumn( name = "order_id" , nullable = false)
private Order order;

@ManyToOne
@JoinColumn(name= "cocktail_id", nullable = false)
private Cocktail cocktail;

@Column(name = "taille")
private String taille;

@Column(name = "prix")
private Double prix;

@Column(name = "quantity")
private Integer quantity;

public static Object status(int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'status'");
}

public Object getCocktailId() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCocktailId'");
}

public void setCocktailId(Object cocktailId) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setCocktailId'");
}


}
