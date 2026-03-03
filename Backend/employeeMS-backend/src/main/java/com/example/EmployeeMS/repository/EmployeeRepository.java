package com.example.EmployeeMS.repository;

import com.example.EmployeeMS.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}