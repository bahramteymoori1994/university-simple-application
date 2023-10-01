package com.example.university.university.model.entities;

import com.example.university.university.model.enums.Gender;
import com.example.university.university.model.enums.TeacherRank;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Audited
@EntityListeners(AuditingEntityListener.class)
@Setter
@Getter
@ToString
@Table(name = "teacher")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher extends AbstractBaseEntity
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

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Gender gender;

    @Column(name = "NATIONAL_CODE", unique = true, length = 10)
    @NotNull
    private String nationalCode;

    @Column(name = "TEACHER_RANK")
    @Enumerated(EnumType.STRING)
    @NotNull
    private TeacherRank teacherRank;
}