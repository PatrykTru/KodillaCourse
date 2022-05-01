package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("board1")
    Board board;



    @Bean
    Board board1(){
        return new Board(new TaskList(),
                new TaskList(),
                new TaskList());
    }

    @Bean
    Board board2(){
        return new Board(new TaskList(),
                new TaskList(),
                new TaskList());
    }
    @Bean
    Board board3(){
        return new Board(new TaskList(),
                new TaskList(),
                new TaskList());
    }
}
