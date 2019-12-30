package com.bloysenberry.workshop.repositories;

import com.bloysenberry.workshop.entities.Category;
import com.bloysenberry.workshop.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
