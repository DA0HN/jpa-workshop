package com.bloysenberry.workshop.services;

import com.bloysenberry.workshop.entities.User;
import com.bloysenberry.workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service    // registro da classe UserService como componente de Servico
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
