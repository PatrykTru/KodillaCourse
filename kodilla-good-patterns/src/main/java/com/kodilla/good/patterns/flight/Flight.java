package com.kodilla.good.patterns.flight;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Flight {
    String startDestination;
    String endDestination;
    String throughDestination;

    public Flight(String startDestination, String endDestination) {
        this.startDestination = startDestination;
        this.endDestination = endDestination;
    }



}
