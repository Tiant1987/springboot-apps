package com.boot.jks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JKSApplication {

    public static void main(String[] args) {
        SpringApplication.run(JKSApplication.class, args);
    }
}
