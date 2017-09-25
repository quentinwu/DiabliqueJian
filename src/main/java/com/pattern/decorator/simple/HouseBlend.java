package com.pattern.decorator.simple;

/**
 * Created by quentin on 12/27/2016.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        double price = 0.89;
        return price;
    }
}
