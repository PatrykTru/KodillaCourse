package com.kodilla.stream.world;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
public class World {

    Set<Continent> continents = new HashSet<>();

    BigDecimal getPeopleQuantity() {

        BigDecimal totalPeople = continents.stream()
                .flatMap(continent -> continent.getCountries().stream()
                        .map(Country::getPeopleQuantity))
                        .reduce(BigDecimal.ZERO, (allPeople, current) -> allPeople.add(current)
                        );


            return totalPeople;

    }


}