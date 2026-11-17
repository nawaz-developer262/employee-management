package com.example.demo_2.controller;

import com.example.demo_2.Employee;
import com.example.demo_2.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.function.ObjDoubleConsumer;

@RestController
@RequestMapping("/api/v1/employee")
@CrossOrigin("http://localhost:4200/")
public class EmployeeController {
public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
}    EmployeeService employeeService;
    @GetMapping
    public Employee getEmployee() {

        Employee employees = employeeService.getEmployees();
        return employees;

    }
    @GetMapping("/count")
    public long getCount() {
        return 100;
    }
}
