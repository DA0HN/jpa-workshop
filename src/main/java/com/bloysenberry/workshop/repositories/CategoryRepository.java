package com.bloysenberry.workshop.repositories;

import com.bloysenberry.workshop.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
