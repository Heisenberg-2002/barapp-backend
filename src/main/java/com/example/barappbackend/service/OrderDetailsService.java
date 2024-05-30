package com.example.barappbackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.barappbackend.model.OrderDetails;
import com.example.barappbackend.repository.OrderDetailsRepository;

@Service
public class OrderDetailsService {
    
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    public List<OrderDetails> findAll() {
        return orderDetailsRepository.findAll();
    }

    public Optional<OrderDetails> findById(Long id) {
        return orderDetailsRepository.findById(id);
    }
    public OrderDetails save(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }
    public void deleteById(Long id) {
        orderDetailsRepository.deleteById(id);
    }

}
