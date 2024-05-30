package com.example.barappbackend.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name="orders")
public class Order {
    
    public Order() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @Column (name = "order_date")
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column( name= "total_price")
    private Double totalPrice;

    @Column ( name = "status")
    private String status;
    


}
