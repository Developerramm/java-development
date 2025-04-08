package com.ram.webdemo.repo;

import com.ram.webdemo.dto.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    List<Student> studentList = new ArrayList<>();
    public List<Student> getAllStudent(){

        Student s1 = new Student(1,"Ram kumar","Noida","Java");
        Student s2 = new Student(2,"Sarita","Delhi","React");
        Student s3 = new Student(3,"Charu","Noida","HTML");
        Student s4 = new Student(4,"Rohan Das","Bangaloru","Python");
        Student s5 = new Student(5,"Deepak","delhi","java");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        return  studentList;
    }

    public void saveStudent(Student student) {
        studentList.add(student);
        System.out.println("Student save successfully");
    }

    public void deleteStudentById(int id) {
        for(Student student : studentList){
            if(student.getId() == id){
                studentList.remove(student);
                System.out.println("Student deleted");
                break;
            }
        }
    }
}
