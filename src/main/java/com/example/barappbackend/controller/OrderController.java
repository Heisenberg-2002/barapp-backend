package com.example.barappbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.barappbackend.model.Order;
import com.example.barappbackend.service.OrderService;

@Controller
@RestController
@RequestMapping("/v1/orders")
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrderById(@PathVariable Long id) {
        return orderService.findById(id); 
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.save(order);
    }


    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order orderInput) {
        Optional<Order> optionalOrder = orderService.findById(id);

        if (optionalOrder.isPresent()) {
            Order existingOrder = optionalOrder.get();
            existingOrder.setOrderDate(orderInput.getOrderDate());
            existingOrder.setTotalPrice(orderInput.getTotalPrice());
            existingOrder.setStatus(orderInput.getStatus());
        return orderService.save(existingOrder);
        }else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id){
        orderService.deleteById(id);
    }


}
