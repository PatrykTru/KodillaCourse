package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Collection Test Suite: begin");
    }

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }


    @DisplayName("When exterminating empty list  ," +
                "Then list should remain empty and not null")
    @Test
    void testOddNumbersExterminatorEmptyList (){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbersList = new ArrayList<>();
        //When
        oddNumbersExterminator.exterminate(numbersList);
        System.out.println("Testing Odd Numbers Exterminator on Empty List");


        //Then
        Assertions.assertNotNull(numbersList);
        Assertions.assertEquals(numbersList, new ArrayList<>());


    }

    @DisplayName("When exterminating normal list , " +
    "Then all numbers from the list should be positive.")
    @Test
    void testOddNumbersExterminatorNormalList (){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(1,2,4,7,8,12,44,66,5,4,3));
        List<Integer> testList = new ArrayList<>(numbersList);
        System.out.println(numbersList.toString());
        //When
        oddNumbersExterminator.exterminate(numbersList);
        System.out.println("Testing Odd Numbers Exterminator on Normal List");

        //Then

        Assertions.assertNotNull(numbersList);
        Assertions.assertNotEquals(numbersList , testList);
        Assertions.assertNotEquals(numbersList.get(4) , testList.get(4));

    }




}
