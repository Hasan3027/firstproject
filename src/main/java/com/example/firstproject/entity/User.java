package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private final int id;
    private String firstname;
    private String lastname;
    private int age;
    @Override
    public String toString() {
        return firstname;
    }

}
