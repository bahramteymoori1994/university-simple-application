package com.example.university.university.dtos;

import lombok.Data;

import java.util.Date;

@Data
public abstract class AbstractBaseDto {

    private Long id;

    private Integer version;

    private Date createdDatTime;

    private Date lastModifiedDateTime;
}
