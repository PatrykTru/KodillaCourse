package com.kodilla.good.patterns.food;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop extends Producer implements ProducerService,InformationService{

    public HealthyShop() {
        super("Healthy Shop", new ArrayList<>());
    }

    @Override
    public void process() {
        System.out.println("Sending invoice info and products to Delivery to HealthyShop");
    }

    @Override
    public void producerInfo(Producer producer) {
        System.out.println(producer.toString());
    }
}
