package com.example.university.university.dtos;

import com.example.university.university.model.enums.Gender;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class StudentDto extends AbstractBaseDto{

    @Pattern(regexp = "^([a-zA-Z]|\\s){3,20}$")
    private String name;

    @Pattern(regexp = "^([a-zA-Z]|\\s){3,20}$")
    private String family;

    private Date birthDate;

    private Integer passedCourses;

    private Gender gender;

    @Pattern(regexp = "^\\d{7}$")
    private String studentId;

    @Pattern(regexp = "^\\d{10}$")
    private String nationalCode;

    private List<CourseDto> courses;
}
