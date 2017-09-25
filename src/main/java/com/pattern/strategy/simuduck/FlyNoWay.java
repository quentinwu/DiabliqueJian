package com.pattern.strategy.simuduck;

/**
 * Created by quentin on 12/23/2016.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
