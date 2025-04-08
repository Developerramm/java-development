package com.ram.webdemo.controller;


import com.ram.webdemo.dto.Student;
import com.ram.webdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return  service.getAllStudents();
    }

    @PostMapping("/add")
    public Student insertData(@RequestBody Student student){
        System.out.println(student);
        service.saveStudent(student);
        return student;
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable int id){
        service.deleteStudentById(id);
        System.out.println("Hi ram kumar maniyari");

    }
}
