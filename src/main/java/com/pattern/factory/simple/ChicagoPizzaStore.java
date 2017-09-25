package com.pattern.factory.simple;

/**
 * Created by quentin on 12/29/2016.
 */
public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        else return null;
    }
}
