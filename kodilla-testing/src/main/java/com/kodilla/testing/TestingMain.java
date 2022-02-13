package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("ForumUser");
        Calculator calculator = new Calculator();

        String result = simpleUser.getUsername();

        if(result.equals("ForumUser"))
            System.out.println("test OK");
        else
            System.out.println("Error");

        if(calculator.add(2,2) == 4)
            System.out.println("test2 OK");
        else
            System.out.println("Error");

        if(calculator.substract(2,2) == 0)
            System.out.println("test3 OK");
        else
            System.out.println("Error");



    }
}
