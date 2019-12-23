package com.bloysenberry.workshop.repositories;

import com.bloysenberry.workshop.entities.Category;
import com.bloysenberry.workshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
