package com.example.university.university.controller;

import com.example.university.university.dtos.CourseDto;
import com.example.university.university.model.entities.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController extends AbstractBaseController<CourseDto, Course> {
}
