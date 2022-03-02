package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void propablyWillThrowExceptionTest() {
        SecondChallenge secondChallenge = new SecondChallenge();

        assertAll
                (
                        () -> assertThrows(Exception.class ,() -> secondChallenge.probablyIWillThrowException(2.0 , 1.0)),
                        () -> assertThrows(Exception.class ,() -> secondChallenge.probablyIWillThrowException(0 , 1.0)),
                        () -> assertThrows(Exception.class ,() -> secondChallenge.probablyIWillThrowException(1.0 , 1.5)),
                        () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0 , 5))


                );


    }
}
