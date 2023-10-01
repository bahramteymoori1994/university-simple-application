package com.example.university.university.dtos;

import lombok.Data;

@Data
public class CourseDto extends AbstractBaseDto
{
    private String courseTitle;

    private Integer courseUnit;
}