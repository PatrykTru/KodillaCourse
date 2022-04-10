package com.kodilla.good.patterns.challenges;

public class OrderServiceImpl implements OrderService{

    @Override
    public void process(Order order) {
        System.out.println("Sending order :" + order.toString() + " to customer");
    }
}
