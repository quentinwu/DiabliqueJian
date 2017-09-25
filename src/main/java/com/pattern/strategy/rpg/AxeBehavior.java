package com.pattern.strategy.rpg;

/**
 * Created by quentin on 12/24/2016.
 */
public class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("With a big axe, I chop off your head!");
    }
}
