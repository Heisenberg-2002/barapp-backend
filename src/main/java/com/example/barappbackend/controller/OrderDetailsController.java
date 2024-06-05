package com.example.barappbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.barappbackend.model.OrderDetails;
import com.example.barappbackend.service.OrderDetailsService;
@CrossOrigin
@Controller
@RestController
@RequestMapping("/v1/orderdetails")
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @GetMapping
    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailsService.findAll();
    }   
    @GetMapping("/{id}")
    public Optional<OrderDetails> getOrderDetailsById(@PathVariable Long id) {
        return orderDetailsService.findById(id);
    }
    @PostMapping
    public OrderDetails createOrderDetails(@RequestBody OrderDetails orderDetails){
        return orderDetailsService.save(orderDetails);
    }
    @PutMapping("/{id}")
    public OrderDetails updateOrderDetails(@PathVariable Long id, @RequestBody OrderDetails orderDetailsInput){
        Optional<OrderDetails> optionalOrderDetails = orderDetailsService.findById(id);

        if(optionalOrderDetails.isPresent()){
            OrderDetails existingOrderDetails = optionalOrderDetails.get();
            existingOrderDetails.setOrder(orderDetailsInput.getOrder());
            existingOrderDetails.setCocktailId(orderDetailsInput.getCocktailId());
            existingOrderDetails.setQuantity(orderDetailsInput.getQuantity());
        return orderDetailsService.save(existingOrderDetails);
        
        }else{
            return null;
        }
    }
        @DeleteMapping("/{id}")
    public void deleteOrderDetails(@PathVariable Long id){
        orderDetailsService.deleteById(id);
    }

}

