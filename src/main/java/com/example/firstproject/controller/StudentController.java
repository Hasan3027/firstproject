package com.example.firstproject.controller;

import com.example.firstproject.DB;
import com.example.firstproject.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class StudentController {

    @RequestMapping(path = "/students", method = RequestMethod.POST)
    public Student addStudent(@RequestBody Student student) {
        System.out.println(student);
        return student;
    }
    @RequestMapping(path = "/students", method = RequestMethod.GET)
    public List<Student> getStudents() {
        return DB.students;
    }

}
