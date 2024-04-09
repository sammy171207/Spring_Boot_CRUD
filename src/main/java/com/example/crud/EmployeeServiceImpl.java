package com.example.crud;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employees = new ArrayList<>();
    
    @Override
    public String creatEmployee(Employee employees) {
       employees.add(employees);
       return"Saved Successfully";
       
    }

    @Override
    public List<Employee> readEmployees() {
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        employees.remove(id);
        return true;
    }


}
