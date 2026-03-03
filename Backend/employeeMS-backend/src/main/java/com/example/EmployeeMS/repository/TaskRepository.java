package com.example.EmployeeMS.repository;

import com.example.EmployeeMS.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {}