package com.bloysenberry.workshop.config;

import com.bloysenberry.workshop.entities.User;
import com.bloysenberry.workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

import static java.util.Arrays.asList;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

    @Autowired  // injeção de dependencia do spring, associa uma instancia de UserRepository
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        var u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        var u2 = new User(null, "Alex Green", "alex@gmail.com", "97777777", "123456");

        userRepository.saveAll(asList(u1, u2));

    }
}
