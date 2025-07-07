package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int studentId;
    private String name;
    private String course;
    private int courseId;

}
