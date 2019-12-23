package com.bloysenberry.workshop.repositories;

import com.bloysenberry.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
