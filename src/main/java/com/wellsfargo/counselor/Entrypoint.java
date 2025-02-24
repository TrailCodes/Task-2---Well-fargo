package com.wellsfargo.counselor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Entrypoint implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Entrypoint.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Custom startup logic goes here
        System.out.println("Application started successfully!");
    }
}
