package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int id;
    private String firstname;
    private String lastname;
    private int age;

    private boolean gender;

    private Address address;

}
