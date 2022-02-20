package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    Statistics statisticsMock;

    private List<String> generateListOfUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String theUser = "User " + n;
            resultList.add(theUser);
        }
        return resultList;
    }

    @Test
    void calculateAdvStatisticsWhen0Posts() {
       //Given
        Stats stats = new Stats();
        stats.postCount= 0;
        when(statisticsMock.postsCount())
                .thenReturn(stats.postCount);
        //When
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0,statisticsMock.postsCount());


    }

    @Test
    void calculateAdvStatisticsWhen1000Posts() {
        //Given
        Stats stats = new Stats();
        stats.postCount= 1000;
        when(statisticsMock.postsCount())
                .thenReturn(stats.postCount);
        //When
        stats.calculateAdvStatistics(statisticsMock);

        //Then

        assertEquals(1000,statisticsMock.postsCount());

    }

    @Test
    void calculateAdvStatisticsWhen0Comments() {
        //Given
        Stats stats = new Stats();
        stats.commentsCount = 0;
        when(statisticsMock.commentsCount())
                .thenReturn(stats.commentsCount);
        //When
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsMock.commentsCount());

    }
    @Test
    void calculateAdvStatisticsWhenCommentsLessThanPosts() {

        //Given
        Stats stats = new Stats();
        stats.commentsCount = 5;
        stats.postCount = 10;
        when(statisticsMock.commentsCount())
                .thenReturn(stats.commentsCount);
        when(statisticsMock.postsCount()).thenReturn(stats.postCount);
        //When
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        assertTrue(statisticsMock.commentsCount() < statisticsMock.postsCount());
    }
    @Test
    void calculateAdvStatisticsWhenPostsLessThanComments() {

        //Given
        Stats stats = new Stats();
        stats.commentsCount = 15;
        stats.postCount = 10;
        when(statisticsMock.commentsCount())
                .thenReturn(stats.commentsCount);
        when(statisticsMock.postsCount()).thenReturn(stats.postCount);
        //When
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        assertTrue(statisticsMock.commentsCount() > statisticsMock.postsCount());

    }
    @Test
    void calculateAdvStatisticsWhen0Users() {

        //Given
        Stats stats = new Stats();
        List<String> testUsers = new ArrayList<>();


        when(statisticsMock.usersNames())
                .thenReturn(testUsers);
        //When
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0,statisticsMock.usersNames().size());

    }
    @Test
    void calculateAdvStatisticsWhen100Users() {

        //Given
        Stats stats = new Stats();
        List<String> testUsers = generateListOfUsers(100);

        when(statisticsMock.usersNames())
                .thenReturn(testUsers);
        //When
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100,statisticsMock.usersNames().size());


    }

    @Test
    void calculateAdvStatisticsAveragesCountingTest() {

        //Given
        Stats stats = new Stats();
        stats.postCount = 12;
        stats.commentsCount =3;
        List<String> testUsers = generateListOfUsers(5);
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(stats.postCount);
        when(statisticsMock.commentsCount()).thenReturn(stats.commentsCount);

        //When
        stats.calculateAdvStatistics(statisticsMock);

        //Then

        assertEquals(2.4 , stats.averagePostsPerUser);
        assertEquals(0.6 , stats.averageCommentsPerUser);
        assertEquals(0.25 , stats.averageCommentsPerPost);


    }
}
