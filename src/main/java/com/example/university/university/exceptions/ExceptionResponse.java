package com.example.university.university.exceptions;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExceptionResponse
{
    private boolean error;
    private String message;
    private LocalDateTime localDateTime;
}