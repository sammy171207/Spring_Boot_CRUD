package com.example.crud;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Import the Employee class from the same package
import com.example.crud.Employee;

@RestController
public class EmpController {

    List<Employee> employees = new ArrayList<>();

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @PostMapping("/employees")
    public String createEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return "Saved Data Successfully";
    }
}
