package com.pattern.decorator.simple;

/**
 * Created by quentin on 12/27/2016.
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double price = beverage.cost();
        if(beverage.getSize() == Size.TALL) {
            price += .10;
        }
        else if(beverage.getSize() == Size.GRANDE) {
            price += .15;
        }
        else if(beverage.getSize() == Size.VENTI) {
            price += .20;
        }
        return price;
    }
}
