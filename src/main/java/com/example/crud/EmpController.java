package com.example.crud;


import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Import the Employee class from the same package


@RestController
public class EmpController {
    // EmployeeService employeeService= new EmployeeServiceImpl();
    // List<Employee> employees = new ArrayList<>();
    @Autowired
    EmployeeService employeeService;
    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployees();
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        // employees.add(employee);
        employeeService.creatEmployee(employee);
        return "Saved Data Successfully";
    }
    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(employeeService.deleteEmployee(id));
        return "delete successfully";
        
       

    }
}
