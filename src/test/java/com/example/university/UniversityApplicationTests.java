package com.example.university;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UniversityApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testAddReturnsCorrectAnswer()
    {
        Assertions.assertThat(divide(100, 4)).isEqualTo(25f);
    }

    public float divide(int a, int b)
    {
        if( b == 0 )
        {
            throw new IllegalArgumentException();
        }

        return (float) a / b;
    }

    @Test
    public void divideCorrectException()
    {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> { divide(100, 0); });
    }
}
