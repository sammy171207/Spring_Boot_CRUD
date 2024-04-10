package com.example.crud;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "emp_db")
public class EmployeeEntity {
      @Id 
      @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name,phone,email;
}
