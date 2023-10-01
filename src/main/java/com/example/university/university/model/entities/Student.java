package com.example.university.university.model.entities;

import com.example.university.university.model.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.List;

@Entity
@Audited
@EntityListeners(AuditingEntityListener.class)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "student")
public class Student extends AbstractBaseEntity
{
    @Column(name = "FIRST_NAME", length = 20)
    @NotNull
    private String name;

    @Column(name = "LAST_NAME", length = 20)
    @NotNull
    private String family;

    @Column(name = "BIRTH_DATE")
    @Temporal(value = TemporalType.DATE)
    @NotNull
    private Date birthDate;

    @Column(name = "PASSED_COURSES")
    @NotNull
    private Integer passedCourses;

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Gender gender;

    @Column(name = "STUDENT_ID", unique = true)
    @NotNull
    private String studentId;

    @Column(name = "NATIONAL_CODE", unique = true, length = 10)
    @NotNull
    private String nationalCode;

    @Column(name = "COURSES")
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Course> courses;
}