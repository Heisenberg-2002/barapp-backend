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

@Column(name= "cockatil_id", nullable = false)
private Long cocktailId;

@Column(name = "taille")
private String taille;

@Column(name = "prix")
private Double prix;

@Column(name = "quantity")
private Integer quantity;


}