package com.pattern.strategy.rpg;

/**
 * Created by quentin on 12/24/2016.
 */
public class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("With a sword, I stab you in the heart!");
    }
}
