package com.example.crud;

import java.util.List;

public interface EmployeeService {

    String creatEmployee(Employee employees);
    List<Employee>readEmployees();
    boolean deleteEmployee(Long id);
} 