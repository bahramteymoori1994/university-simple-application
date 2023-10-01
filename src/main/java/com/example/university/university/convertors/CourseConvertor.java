package com.example.university.university.convertors;

import com.example.university.university.dtos.CourseDto;
import com.example.university.university.model.entities.Course;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface CourseConvertor extends BaseConvertor<CourseDto, Course>{
}
