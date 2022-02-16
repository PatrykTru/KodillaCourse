package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock ;
    Map<String, Double> temperaturesMap = new HashMap<>();
    
    @BeforeEach
    void setUp() {
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Gdansk", 26.1);
        temperaturesMap.put("Krakow", 26.2);
    }

    @Test
    void calculateWeatherForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5,quantityOfSensors);
    }

    @Test
    void calculateAverageWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //When
        Double average = weatherForecast.calculateForecastAverage();
        //Then
        Assertions.assertEquals(25.56,average);
    }

    @Test
    void calculateMedianaWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //When
        Double average = weatherForecast.calculateForecastMediana();
        //Then
        Assertions.assertEquals(25.5,average);
    }
}
