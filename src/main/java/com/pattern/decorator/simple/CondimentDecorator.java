package com.pattern.decorator.simple;

/**
 * Created by quentin on 12/27/2016.
 */
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;
    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }

}
