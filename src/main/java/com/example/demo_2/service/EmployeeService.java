package com.example.demo_2.service;

import com.example.demo_2.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee getEmployees() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("John Doe");
        employee.setSalary(50000L);
        return employee;
    }
}
