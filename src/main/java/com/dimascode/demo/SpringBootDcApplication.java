package com.dimascode.demo;

import com.dimascode.demo.model.Order;
import com.dimascode.demo.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDcApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(OrderRepository repository) {
        return args -> repository.save(new Order(1, "potato", "I order a lot of potato"));
    }

}
