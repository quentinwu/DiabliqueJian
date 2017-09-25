package com.pattern.strategy.simuduck;

/**
 * Created by quentin on 12/24/2016.
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
