package com.pattern.strategy.rpg;

import java.lang.*;

/**
 * Created by quentin on 12/24/2016.
 */
public class Knight extends Character {
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm a righteous knight");
    }

}
