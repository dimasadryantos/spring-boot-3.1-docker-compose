package com.dimascode.demo.repository;

import com.dimascode.demo.model.Order;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<Order, Integer> {
}
