package com.bloysenberry.workshop.services;

import com.bloysenberry.workshop.entities.Category;
import com.bloysenberry.workshop.entities.Product;
import com.bloysenberry.workshop.repositories.CategoryRepository;
import com.bloysenberry.workshop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
