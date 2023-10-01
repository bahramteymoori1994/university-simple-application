package com.example.university.university.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

@Entity
@Audited
@EntityListeners(AuditingEntityListener.class)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "course")
public class Course extends AbstractBaseEntity
{
    @Column(name = "COURSE_TITLE")
    @NotNull
    private String courseTitle;

    @Column(name = "COURSE_UNIT")
    @NotNull
    private Integer courseUnit;

    @Column(name = "STUDENTS")
    @ManyToMany(mappedBy = "courses", fetch = FetchType.EAGER)
    private List<Student> students;
}