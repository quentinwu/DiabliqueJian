package com.pattern.decorator.simple;

/**
 * Created by quentin on 12/27/2016.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        double price = 0.30;
        return beverage.cost() + price;
    }
}
