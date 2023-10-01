package com.example.university.university.convertors;

import com.example.university.university.dtos.TeacherDto;
import com.example.university.university.model.entities.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherConvertor extends BaseConvertor<TeacherDto, Teacher>{
}
