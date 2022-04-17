package com.kodilla.good.patterns.flight;

public interface FlightService {

    void searchFlightToDestination(String destinationAirPort);
    void searchFlightFromDestination(String startingAirPort);
    void searchFlightThroughDestination(String throughAirPort);

}
