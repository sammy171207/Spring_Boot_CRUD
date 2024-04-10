package com.example.crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepositry employeeRepositry;
    List<Employee> employees = new ArrayList<>();
    
    @Override
    public String creatEmployee(Employee employees) {
        EmployeeEntity employeeEntity= new EmployeeEntity();
        
        BeanUtils.copyProperties(employees, employeeEntity);
    //    employees.add(employees);
    ((CrudRepository<EmployeeEntity, Long>) employeeRepositry).save(employeeEntity);
       return"Saved Successfully";
       
    }

    @Override
    public List<Employee> readEmployees() {
        List<EmployeeEntity>employeesList =employeeRepositry.findAll();
        for (EmployeeEntity employeeEntity : employeesList) {
             Employee emp= new Employee();
             emp.setId(employeeEntity.getId());
             emp.setName(employeeEntity.getName());
             emp.setPhone(employeeEntity.getPhone());
             emp.setEmail(employeeEntity.getEmail());
            employees.add(emp);
            
        }
        return employees;

    }

    @Override
    
    public boolean deleteEmployee(Long id) {
        EmployeeEntity emp=employeeRepositry.findById(id).get();
        employeeRepositry.delete(emp);
        return true;
    }

    @Override
    public String updateEmployee(Long id, Employee employee) {
        EmployeeEntity exemp= employeeRepositry.findById(id).get();
        exemp.setName(employee.getName());
        exemp.setEmail(employee.getEmail());
        exemp.setPhone(employee.getPhone());
        employeeRepositry.save(exemp);
        return "Update Suceessfully";
    }
    
}
