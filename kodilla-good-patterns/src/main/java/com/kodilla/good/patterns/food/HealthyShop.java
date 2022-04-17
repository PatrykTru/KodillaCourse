package com.kodilla.good.patterns.food;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop extends Producer implements ProducerService{

    public HealthyShop() {
        super("Healthy Shop", new ArrayList<>());
    }

    @Override
    public void process() {
        System.out.println("Sending invoice info and products to Delivery to HealthyShop");
    }
}
