package com.pattern.observer.simple;

/**
 * Created by quentin on 12/26/2016.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(32, 50, 16);
        weatherData.setMeasurements(40, 35, 22);

    }
}
