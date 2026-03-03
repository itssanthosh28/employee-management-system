package com.example.EmployeeMS.repository;

import com.example.EmployeeMS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}