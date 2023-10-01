package com.example.university.university.controller;

import com.example.university.university.dtos.StudentDto;
import com.example.university.university.model.entities.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController extends AbstractBaseController<StudentDto, Student>{
}
