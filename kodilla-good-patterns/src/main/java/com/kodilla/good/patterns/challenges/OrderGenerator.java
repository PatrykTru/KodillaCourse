package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderGenerator {

    public Order generateOrders(){
        Product horizonForbiddenWestGame = new Product("Horizon Forbidden West PS4" , 300.00);
        Product sneakySlippers = new Product("Sneaky Slippers" , 20.00);
        List<Product> orderList = Arrays.asList(sneakySlippers,horizonForbiddenWestGame);
        Order order = new Order(orderList,LocalDate.now() );

        return order;
    }
}
