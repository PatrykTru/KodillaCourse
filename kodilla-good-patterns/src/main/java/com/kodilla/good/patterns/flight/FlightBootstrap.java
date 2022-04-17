package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightBootstrap {

    public List<Flight> addFlights(){
        List<Flight> flightList = new ArrayList<>();

        Flight flight1 = new Flight("GDANSK" , "EINDHOVEN" ,"");
        Flight flight2 = new Flight("GDANSK" , "WARSZAWA" ,"" );
        Flight flight3 = new Flight("WARSZAWA" , "MOSKWA" ,"");
        Flight flight4 = new Flight("EINDHOVEN" , "BARCELONA" ,"");
        Flight flight5= new Flight("GDANSK" , "BARCELONA" ,"");
        Flight flight6 = new Flight("GDANSK" , "SEUL" ,"");

        Flight flight7 = new Flight("GDANSK" , "SEUL" , "MOSKWA" );
        Flight flight8 = new Flight("GDANSK" , "MEKSYK" , "WARSZAWA");
        Flight flight9 = new Flight("GDANSK" , "SEUL" , "WARSZAWA" );
        Flight flight10 = new Flight("KATOWICE" , "BARCELONA" , "EINDHOVEN"  );
        Flight flight11 = new Flight("KATOWICE" , "SEUL" , "MOSKWA" );
        Flight flight12 = new Flight("GDANSK" , "KATOWICE" , "WARSZAWA" );


        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
        flightList.add(flight6);
        flightList.add(flight7);
        flightList.add(flight8);
        flightList.add(flight9);
        flightList.add(flight10);
        flightList.add(flight11);
        flightList.add(flight12);



        return flightList;
    }
}
