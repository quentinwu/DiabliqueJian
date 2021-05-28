package com.math;

//import java.lang.reflect.Array;

import java.util.Arrays;

/**
 * Created by quentin on 1/17/2018.
 */
public class Jyalu {
    public static void main(String[] args) {

        int[] values = {1,22,33,15,7, 100, 30, 89};
        int pos = 2;
        //int valueToInsert = 3;
        int currentSize = 5;
        for(int i = pos; i < currentSize -1; i++) {
            values[i+1] = values[i];
            System.out.println(values[i]);
        }
        System.out.println("QQQQ: " + Arrays.toString(values));
    }
}
