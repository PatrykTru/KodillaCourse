package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(5.0, 1.5);}
        catch (Exception e)
        {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
        finally {
            System.out.println("Im always working");
        }

    }
}
