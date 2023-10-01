package com.example.university.university.services;

import com.example.university.university.model.entities.Student;
import com.example.university.university.model.repositories.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends AbstractBaseService<StudentRepository, Student>{
}
