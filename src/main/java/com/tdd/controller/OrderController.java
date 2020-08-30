package com.tdd.controller;

import com.tdd.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class OrderController {

    @GetMapping(value = "/orders")
    public List<Order> getAllOrder(){
        return null;
    }
    @GetMapping(value = "/order/{orderId}")
    public Order getOrder(@PathVariable int orderId){
        return null;
    }
}
