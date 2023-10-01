package com.example.university.university.dtos;

import com.example.university.university.model.enums.Gender;
import com.example.university.university.model.enums.TeacherRank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.Date;

@Data
public class TeacherDto extends AbstractBaseDto
{
    @Pattern(regexp = "^([a-zA-Z]|\\s){3,20}$")
    private String name;

    @Pattern(regexp = "^([a-zA-Z]|\\s){3,20}$")
    private String family;

    private Date birthDate;

    private Gender gender;

    @Pattern(regexp = "^\\d{10}$")
    private String nationalCode;

    private TeacherRank teacherRank;


}