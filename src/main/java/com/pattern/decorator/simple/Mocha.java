package com.pattern.decorator.simple;

/**
 * Created by quentin on 12/27/2016.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        double price = 0.20;
        return beverage.cost() + price;
    }
}
