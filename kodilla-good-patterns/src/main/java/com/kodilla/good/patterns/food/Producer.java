package com.kodilla.good.patterns.food;

import lombok.Setter;

import java.util.List;

@Setter
public class Producer  {

    private String producerName;
    private List<Product> products;

    public Producer(String producerName, List<Product> products) {
        this.producerName = producerName;
        this.products = products;
    }


}
