package com.pattern.decorator.simple;

/**
 * Created by quentin on 12/27/2016.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        double price = 1.69;
        return price;
    }
}