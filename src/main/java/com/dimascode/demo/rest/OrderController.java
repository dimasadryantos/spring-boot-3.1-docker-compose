package com.dimascode.demo.rest;

import com.dimascode.demo.model.Order;
import com.dimascode.demo.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class OrderController {

    private OrderRepository repository;

    @GetMapping(value = "/orders")
    public List<Order> getOrders() {
        return repository.findAll();
    }
}
