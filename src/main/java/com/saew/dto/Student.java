package com.saew.dto;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private String email;
    private float gpa;

    public Student(int id, String name, String email, float gpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gpa = gpa;
    }
}
