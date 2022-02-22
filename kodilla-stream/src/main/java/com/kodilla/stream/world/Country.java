package com.kodilla.stream.world;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class Country {

    BigDecimal peopleQuantity ;

    BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

}
