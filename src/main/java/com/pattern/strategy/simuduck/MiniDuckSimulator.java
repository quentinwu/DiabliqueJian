package com.pattern.strategy.simuduck;

/**
 * Created by quentin on 12/24/2016.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        //FlyBehavior fb = new FlyRocketPowered();
        //model.setFlyBehavior(fb);
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
