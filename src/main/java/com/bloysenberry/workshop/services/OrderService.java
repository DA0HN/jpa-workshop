package com.bloysenberry.workshop.services;

import com.bloysenberry.workshop.entities.Order;
import com.bloysenberry.workshop.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.orElse(null);
    }

    public List<Order> findAll() {
        return repository.findAll();
    }
}
