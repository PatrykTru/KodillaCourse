package com.kodilla.good.patterns.challenges;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProductOrderService {

    private InformationServiceImpl informationService = new InformationServiceImpl();
    private OrderServiceImpl orderService = new OrderServiceImpl();



    public void proceedOrder(Order order){

        informationService.sendInfo(order);
        orderService.process(order);

    }
}
