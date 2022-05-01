package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = (Board)context.getBean("board1");
        board.doneList = (TaskList) Arrays.asList("task1" , "task2" , "task3");
        board.inProgressList = (TaskList) Arrays.asList("task5" , "task6" , "task7");
        board.toDoList = (TaskList) Arrays.asList("task8" , "task9" , "task99");
        //Then
        Assertions.assertEquals( Arrays.asList("task1" , "task2" , "task3"),board.doneList);
        Assertions.assertEquals( Arrays.asList("task5" , "task6" , "task7"),board.inProgressList);
        Assertions.assertEquals( Arrays.asList("task8" , "task9" , "task99"),board.toDoList);
    }
}
