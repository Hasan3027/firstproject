package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Counter {

    private int id;
    private int count;

    public static int nextId;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }
}
