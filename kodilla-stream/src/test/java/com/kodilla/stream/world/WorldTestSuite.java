package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {


    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("39455333"));
        Country czechRepublic = new Country(new BigDecimal("15340234"));
        Country china = new Country(new BigDecimal("1001987678"));
        Country russia = new Country(new BigDecimal("398887565"));
        Country maroko = new Country(new BigDecimal("8887565"));
        Country egypt = new Country(new BigDecimal("21887565"));

        Continent europe = new Continent(Set.of(poland,czechRepublic));
        Continent asia = new Continent(Set.of(china,russia));
        Continent africa = new Continent(Set.of(maroko,egypt));

        World world = new World(Set.of(europe,africa,asia));

        //When
        BigDecimal allPeople = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("1486445940") , allPeople);



    }
}
