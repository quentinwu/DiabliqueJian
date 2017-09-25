package com.pattern.strategy.rpg;

import java.lang.*;

/**
 * Created by quentin on 12/24/2016.
 */
public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm a mighty troll!");
    }
}
