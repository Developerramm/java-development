package com.jpa.controller;


import com.jpa.entity.Employee;
import com.jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAll")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmp();
    }

    @PostMapping("/add")
    public Employee createEmployee(@RequestBody Employee employee){
      return employeeService.createEmployee(employee);
    }
}
