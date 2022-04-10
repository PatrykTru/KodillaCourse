package com.kodilla.good.patterns.challenges;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class Order {
    private List<Product> products;
    private LocalDate orderDate;

}
