package com.pattern.observer.simple;

/**
 * Created by quentin on 12/25/2016.
 */
public interface Observer {
    public void update(float temp,
                       float humidity,
                       float pressure);
}
