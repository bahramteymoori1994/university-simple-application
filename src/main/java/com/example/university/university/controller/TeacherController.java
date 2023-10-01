package com.example.university.university.controller;

import com.example.university.university.dtos.TeacherDto;
import com.example.university.university.model.entities.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController extends AbstractBaseController<TeacherDto, Teacher>{
}
