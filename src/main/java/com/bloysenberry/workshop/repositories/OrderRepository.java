package com.bloysenberry.workshop.repositories;

import com.bloysenberry.workshop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
