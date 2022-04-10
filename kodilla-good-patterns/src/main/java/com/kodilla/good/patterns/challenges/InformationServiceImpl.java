package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class InformationServiceImpl implements InformationService {

    @Override
    public void sendInfo(Order order) {
        System.out.println("Your order is proceeding, the order:" + order.toString());
        System.out.println("Estimate delivery time is: " + order.getOrderDate().plusDays(3) );
    }
}
