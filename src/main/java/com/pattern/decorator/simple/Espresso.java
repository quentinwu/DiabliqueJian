package com.pattern.decorator.simple;

/**
 * Created by quentin on 12/27/2016.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        double price = 1.99;
        return price;
    }
}
