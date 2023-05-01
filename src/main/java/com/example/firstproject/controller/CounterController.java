package com.example.firstproject.controller;

import com.example.firstproject.DB;
import com.example.firstproject.entity.Counter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CounterController {

    @GetMapping(path = "/count")
    public List<Counter> getCount() {
        return DB.counters;
    }

    @PostMapping(path = "/count")
    public String addCount(@RequestBody Counter counter) {
        counter.setId(++Counter.nextId);
        DB.counters.add(counter);
        return "added successfully";
    }

    @PutMapping(path = "/count/plus/{id}")
    public String increment(@PathVariable Integer id) {
        Counter counter = DB.counters.stream().filter(i -> i.getId() == id).findFirst().get();
        counter.increment();
        return "updated successfully";
    }

    @PutMapping(path = "/count/minus/{id}")
    public String decrement(@PathVariable Integer id) {
        Counter counter = DB.counters.stream().filter(i -> i.getId() == id).findFirst().get();
        counter.decrement();
        return "updated successfully";
    }

}
