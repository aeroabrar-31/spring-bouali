package com.kalaam.kalam.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getAllstudents()
    {
        Student s1=new Student(101,"Abrar","CSE","5g2");
        Student s2=new Student(102,"Kalam","Civil","5g1");
        Student s3=new Student(103,"Chand","ECE","5g6");

        List<Student> al= Arrays.asList(s1,s2,s3);
        return al;
    }
}
