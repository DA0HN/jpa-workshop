package com.bloysenberry.workshop.repositories;

import com.bloysenberry.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// nao e necessario a notacao @Repository ja que esta herdando da JpaRepository
public interface UserRepository extends JpaRepository<User, Long> {
}
