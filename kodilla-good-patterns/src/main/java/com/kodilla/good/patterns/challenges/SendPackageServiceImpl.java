package com.kodilla.good.patterns.challenges;

public class SendPackageServiceImpl implements SendPackageService{

    @Override
    public void send(Order order) {
        System.out.println("Sending order: " + order);
    }
}
