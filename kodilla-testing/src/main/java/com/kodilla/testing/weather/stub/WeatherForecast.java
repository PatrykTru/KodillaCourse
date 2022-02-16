package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String,Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String,Double> temperature: temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(),temperature.getValue());
        }
        return resultMap;
    }

    public Double calculateForecastAverage(){
        Double sum= 0.0;
        int count=0;

        for (Map.Entry<String,Double> temperature: temperatures.getTemperatures().entrySet()){
            sum =sum+ temperature.getValue();
            count++;
        }
        return sum/count;
    }

    public Double calculateForecastMediana(){
        Double mediana = 0.0;
        List<Double> temperaturesList = new ArrayList<>();

        for (Map.Entry<String,Double> temperature: temperatures.getTemperatures().entrySet()){
            temperaturesList.add(temperature.getValue());
        }
        Collections.sort(temperaturesList);

        if(temperaturesList.size()%2==0){
            mediana = temperaturesList.get((temperaturesList.size()-1)/2+1);
        }
        else {
            mediana = temperaturesList.get((temperaturesList.size() - 1) / 2);
        }

        return mediana;

    }





}
