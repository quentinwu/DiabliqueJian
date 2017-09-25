package com.pattern.strategy.simuduck;

/**
 * Created by quentin on 12/24/2016.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
