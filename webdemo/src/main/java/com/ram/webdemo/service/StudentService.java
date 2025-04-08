package com.ram.webdemo.service;

import com.ram.webdemo.dto.Student;
import com.ram.webdemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;
    public List<Student> getAllStudents(){
       List<Student> allStudent =  studentRepo.getAllStudent();
       return  allStudent;
    }

    public void saveStudent(Student student) {
        studentRepo.saveStudent(student);
    }

    public void deleteStudentById(int id) {
        studentRepo.deleteStudentById(id);
    }
}
