package com.kodilla.good.patterns.food;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop extends Producer implements ProducerService{

    public GlutenFreeShop() {
        super("Gluten Free Shop", new ArrayList<>());
    }

    @Override
    public void process() {
        System.out.println("Sending invoice info and products to Delivery to GlutenFreeShop");
    }
}
