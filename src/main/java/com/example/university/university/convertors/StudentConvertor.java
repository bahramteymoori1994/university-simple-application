package com.example.university.university.convertors;

import com.example.university.university.dtos.StudentDto;
import com.example.university.university.model.entities.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentConvertor extends BaseConvertor<StudentDto, Student>
{

}