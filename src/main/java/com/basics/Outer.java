package com.basics;

/**
 * Created by quentin on 9/3/2017.
 */
public class Outer {
    private int outerX = 100;

    public int test() {
        Inner inner = new Inner();
        return inner.display();
    }

    private class Inner {
        private int display() {
           return outerX;
        }
    }
}
