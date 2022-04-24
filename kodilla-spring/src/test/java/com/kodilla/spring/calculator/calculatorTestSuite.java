package com.kodilla.spring.calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class calculatorTestSuite {
    @Autowired
    Calculator calculator;
    double a = 10;
    double b = 2;
    double c ;

    @BeforeEach
    void setUp() {
        c = 0;
    }

    @Test
    void addTest() {
        //When
       c =  calculator.add(a,b);
       //Then
        assertEquals(12 , c);
    }

    @Test
    void subTest() {
        //When
        c =  calculator.sub(a,b);
        //Then
        assertEquals(8 , c);
    }

    @Test
    void multiplyTest() {
        //When
        c =  calculator.mul(a,b);
        //Then
        assertEquals(20 , c);
    }

    @Test
    void divTest() {
        //When
        c =  calculator.div(a,b);
        //Then
        assertEquals(5 , c);
    }
}
