package com.kodilla.good.patterns.food;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Product {
    private String productName;
    private double productPrice;
    private int productAmount;
}
