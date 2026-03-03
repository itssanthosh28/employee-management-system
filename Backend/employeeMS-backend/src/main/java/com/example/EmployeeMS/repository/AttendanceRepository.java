package com.example.EmployeeMS.repository;

import com.example.EmployeeMS.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {}