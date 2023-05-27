package com.example.springbootemployeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  main.java.com.example.springbootemployeemanagementsystem.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}