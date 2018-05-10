package com.example.komunitasku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class KomunitaskuApplication {

    public static void main(String[] args) {
        SpringApplication.run(KomunitaskuApplication.class, args);
    }
}
