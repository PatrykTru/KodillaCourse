package com.kodilla.good.patterns.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraFoodShop extends Producer implements ProducerService{

    Product eggs = new Product("Eggs" , 8.00,100);
    Product milk = new Product("Milk" , 3.00 ,20);

    List<Product> products = Arrays.asList(eggs,milk);
    public ExtraFoodShop() {
        super("Extra Food Shop", new ArrayList<>());
    }


    @Override
    public void process() {
        System.out.println("Sending invoice info and products to Delivery to ExtraFoodShop");
    }
}
