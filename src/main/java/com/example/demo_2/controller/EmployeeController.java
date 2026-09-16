package com.example.demo_2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @GetMapping
    public String getEmployee() {
        return "Employee details";
    }
}
