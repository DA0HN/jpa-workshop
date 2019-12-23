package com.bloysenberry.workshop.config;

import com.bloysenberry.workshop.entities.Category;
import com.bloysenberry.workshop.entities.Order;
import com.bloysenberry.workshop.entities.Product;
import com.bloysenberry.workshop.entities.User;
import com.bloysenberry.workshop.entities.enums.OrderStatus;
import com.bloysenberry.workshop.repositories.CategoryRepository;
import com.bloysenberry.workshop.repositories.OrderRepository;
import com.bloysenberry.workshop.repositories.ProductRepository;
import com.bloysenberry.workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;

import static java.util.Arrays.asList;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

    @Autowired  // injeção de dependencia do spring, associa uma instancia de UserRepository
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        // instanciando categorias
        var cat1 = new Category(null, "Electronics");
        var cat2 = new Category(null, "Books");
        var cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(asList(cat1, cat2, cat3));

        // instanciando produtos
        var p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        var p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        var p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        var p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        var p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        productRepository.saveAll(asList(p1, p2, p3, p4, p5));

        // instanciando usuarios
        var u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        var u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        var u3 = new User(null, "Martin Black", "martin@gmail.com", "966667777", "123456");
        var u4 = new User(null, "John Grey", "john@gmail.com", "933334444", "123456");

        // instanciando Orders
        var od1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED,         u1);
        var od2 = new Order(null, Instant.parse("2019-06-21T19:53:28Z"), OrderStatus.CANCELED,          u1);
        var od3 = new Order(null, Instant.parse("2019-06-21T21:33:05Z"), OrderStatus.PAID,              u2);
        var od4 = new Order(null, Instant.parse("2019-06-21T21:43:57Z"), OrderStatus.SHIPPED,           u3);
        var od5 = new Order(null, Instant.parse("2019-06-22T20:12:17Z"), OrderStatus.WAITING_PAYMENT,   u4);

        // salvando Order e User no banco
        userRepository.saveAll(asList(u1, u2, u3, u4));
        orderRepository.saveAll(asList(od1, od2, od3, od4, od5));
    }
}
