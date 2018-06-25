package com.example.komunitasku;

import com.example.komunitasku.filemanager.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class KomunitaskuApplication {

    public static void main(String[] args) {
        SpringApplication.run(KomunitaskuApplication.class, args);
    }
}
