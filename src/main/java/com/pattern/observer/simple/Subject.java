package com.pattern.observer.simple;

/**
 * Created by quentin on 12/25/2016.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
