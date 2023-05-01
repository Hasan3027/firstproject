package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {

    private int id;
    private String title;
    private String body;
    private int userId;


}
