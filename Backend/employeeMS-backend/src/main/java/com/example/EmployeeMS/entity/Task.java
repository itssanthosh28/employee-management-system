package com.example.EmployeeMS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String status;
    private LocalDate dueDate;

    @ManyToOne
    private Employee employee;
}
