package com.example.firstproject.entity;

import com.example.firstproject.entity.Enums.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

    private Integer id;
    private Double amount;
    private Type type;

    public static int nextId;

}
