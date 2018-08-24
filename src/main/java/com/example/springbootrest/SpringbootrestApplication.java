package com.example.springbootrest;

import com.example.springbootrest.config.ints.InitDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootrestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootrestApplication.class, args);
    }

    @Bean(initMethod = "init")
    public InitDB initialiser() {
        return new InitDB();
    }

}
