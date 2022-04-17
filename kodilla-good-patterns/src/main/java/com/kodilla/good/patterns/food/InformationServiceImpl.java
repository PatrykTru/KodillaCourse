package com.kodilla.good.patterns.food;



public class InformationServiceImpl implements InformationService{

    @Override
    public void producerInfo(Producer producer) {
        System.out.println(producer.toString());
    }
}
