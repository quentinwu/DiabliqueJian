package com.pattern.observer.builtin;

/**
 * Created by quentin on 12/26/2016.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(32, 50, 16);
        weatherData.setMeasurements(40, 35, 22);

    }
}
