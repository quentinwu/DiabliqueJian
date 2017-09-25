package com.pattern.strategy.rpg;

/**
 * Created by quentin on 12/24/2016.
 */
public class PlayGame {
    public static void main(String[] args) {
        Character troll = new Troll();
        troll.display();
        troll.useWeapon();

        troll.setWeaponBehavior(new SwordBehavior());
        troll.useWeapon();

        Character knight = new Knight();
        knight.display();
        knight.useWeapon();
        knight.setWeaponBehavior(new AxeBehavior());
        knight.useWeapon();
    }
}
