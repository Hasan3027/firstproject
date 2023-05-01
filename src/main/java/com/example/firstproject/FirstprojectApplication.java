package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstprojectApplication {

    public static void main(String[] args) {
        DB.turnOn();
        SpringApplication.run(FirstprojectApplication.class, args);
    }

}
