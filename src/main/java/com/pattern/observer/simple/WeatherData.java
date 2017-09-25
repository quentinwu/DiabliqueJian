package com.pattern.observer.simple;

import java.util.ArrayList;

/**
 * Created by quentin on 12/26/2016.
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        System.out.println("I added one");
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i > 0) {
           observers.remove(i);
        }
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
        /*observers.forEach((observer) -> {
                    observer.update(temperature, humidity, pressure);
                }
        );*/
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
