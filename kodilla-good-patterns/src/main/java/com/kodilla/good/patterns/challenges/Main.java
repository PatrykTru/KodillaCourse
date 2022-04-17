package com.kodilla.good.patterns.challenges;

public class Main {


    public static void main(String[] args) {

        OrderGenerator orderGenerator = new OrderGenerator();
       Order order = orderGenerator.generateOrders();
       ProductOrderService productOrderService = new ProductOrderService();
       productOrderService.proceedOrder(order);


    }
}
