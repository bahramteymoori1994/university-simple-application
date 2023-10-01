package com.example.university;

import com.example.university.university.exceptions.ServiceException;
import com.example.university.university.model.entities.Student;
import com.example.university.university.model.enums.Gender;
import com.example.university.university.model.repositories.StudentRepository;
import com.example.university.university.services.StudentService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@SpringBootTest
@Import(UniversityApplication.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Transactional(readOnly = false)
@EnableTransactionManagement
@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase
@Rollback(false)
class UniversityApplicationTests {

    @MockBean
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @BeforeAll
    public void initialization()
    {
        Student student = Student.builder()
                .name("ali")
                .family("alipoor")
                .gender(Gender.MALE)
                .birthDate(new Date(1990-10-10))
                .passedCourses(99)
                .nationalCode("9876543210")
                .build();
        student.setId(1L);

        Mockito.when(studentRepository.findAll()).thenReturn(Collections.singletonList(student));
        Mockito.when(studentRepository.findById(-1L)).thenThrow(new IllegalArgumentException());
    }

    @Test
    void contextLoads() {
    }

    @Test
    public void testStudentRepository() throws ServiceException {
        List<Student> allStudents = studentService.findAll();
        Assertions.assertThat(allStudents).size().isEqualTo(1);
    }
}