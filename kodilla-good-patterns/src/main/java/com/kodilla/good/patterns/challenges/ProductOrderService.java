package com.kodilla.good.patterns.challenges;



public class ProductOrderService {

    private InformationServiceImpl informationService = new InformationServiceImpl();
    private OrderServiceImpl orderService = new OrderServiceImpl();
    private SendPackageServiceImpl sendPackageService = new SendPackageServiceImpl();

    public ProductOrderService() {

    }

    public void proceedOrder(Order order){

        informationService.sendInfo(order);
        orderService.process(order);
        sendPackageService.send(order);

    }
}
