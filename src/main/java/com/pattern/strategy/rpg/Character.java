package com.pattern.strategy.rpg;

/**
 * Created by quentin on 12/24/2016.
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character(){}

    public abstract void display();

    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }

    public void useWeapon() {
        weaponBehavior.useWeapon();
    }
}
