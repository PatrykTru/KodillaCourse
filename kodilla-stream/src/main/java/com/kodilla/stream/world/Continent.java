package com.kodilla.stream.world;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
@Getter
@AllArgsConstructor
public class Continent {
    Set<Country> countries = new HashSet<>();
}
