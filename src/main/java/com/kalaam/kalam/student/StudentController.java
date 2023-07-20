package com.kalaam.kalam.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<String> getAllstudents()
    {
        List<String> al= Arrays.asList("Abrar" , "Kalam", "Chand");
        return al;
    }
}
