package com.kodilla.good.patterns.food;

public class Main {


    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        extraFoodShop.process();
        extraFoodShop.producerInfo(extraFoodShop);
        glutenFreeShop.process();
        glutenFreeShop.producerInfo(glutenFreeShop);
        healthyShop.process();
        healthyShop.producerInfo(healthyShop);
    }
}
