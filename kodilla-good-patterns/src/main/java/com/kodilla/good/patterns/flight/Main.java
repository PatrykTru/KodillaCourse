package com.kodilla.good.patterns.flight;

public class Main {



    public static void main(String[] args) {
        FlightBootstrap flightBootstrap = new FlightBootstrap();
        FlightServiceImpl flightService = new FlightServiceImpl(flightBootstrap.addFlights());

        flightService.searchFlightFromDestination("GDANSK");
        flightService.searchFlightThroughDestination("WARSZAWA");
        flightService.searchFlightToDestination("SEUL");
    }

}
