package com.example.service;

import com.example.model.Student;

public interface StudentService {
    Student getById(int id);
    Student getByName(String name);
    boolean save(Student student);

}
