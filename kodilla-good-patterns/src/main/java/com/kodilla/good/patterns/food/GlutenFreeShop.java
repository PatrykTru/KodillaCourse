package com.kodilla.good.patterns.food;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop extends Producer implements ProducerService , InformationService{

    public GlutenFreeShop() {
        super("Gluten Free Shop", new ArrayList<>());
    }

    @Override
    public void process() {
        System.out.println("Sending invoice info and products to Delivery to GlutenFreeShop");
    }

    @Override
    public void producerInfo(Producer producer) {
        System.out.println(producer.toString());
    }
}
