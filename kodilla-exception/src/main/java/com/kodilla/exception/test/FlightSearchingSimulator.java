package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchingSimulator {

    public Boolean findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flightsMap = new HashMap();
        flightsMap.put("EindHoven" , true);
        flightsMap.put("Katowice" , true);
        flightsMap.put("Kraków" , false);
        flightsMap.put("New York" , false);

        Boolean value = flightsMap.get(flight.getDepartureAirport())  ;
        if(value!= null){
            return flightsMap.get(flight.getDepartureAirport())  ;
        }
        else {
            throw new RouteNotFoundException();
        }

    }

    public static void main(String[] args) {
        Flight flight = new Flight("EindHoven" , "Katowice");
        Flight flight2 = new Flight("e" , "e");
        FlightSearchingSimulator flightSearchingSimulator = new FlightSearchingSimulator();
        try {
            System.out.println("Is flight available? : " + flightSearchingSimulator.findFlight(flight));
            System.out.println("Is flight available? : " + flightSearchingSimulator.findFlight(flight2));
        }catch (RouteNotFoundException e)
        {
            System.out.println("Wrong airport name!");
            e.printStackTrace();

        }


    }

}
