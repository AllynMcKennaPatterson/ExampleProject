package com.example.service.impl;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getById(int id) {
        Student s = new Student();
        s.setId(id);
        s.setName("name-" + id);
        s.setMobileNo("111111111");
        return s;
    }

    @Override
    public Student getByName(String name) {
        Student s = new Student();
        s.setId(2);
        s.setName(name);
        s.setMobileNo("222222222");
        return s;
    }

    @Override
    public boolean save(Student student) {
        System.out.println("id: " + student.getId() + ", name: " + student.getName() + ", mobileNo: " + student.getMobileNo());

        return false;
    }
}
