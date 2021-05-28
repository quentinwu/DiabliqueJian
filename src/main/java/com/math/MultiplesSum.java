package com.math;

import java.util.ArrayList;
import java.util.concurrent.atomic.LongAdder;

/**
 * Created by quentin on 12/3/2017.
 */
public class MultiplesSum {
    private int endNumber;
    private int[] multiplier;
    private ArrayList<Integer> multiplied;

    public MultiplesSum(int[] multiplier, int endNumber) {
        this.multiplier = multiplier;
        this.endNumber = endNumber;
        multiplied = new ArrayList<>();
        getListOfMultiplesOfN(1);
    }

    private void getListOfMultiplesOfN(int start) {
        if(start == endNumber) {
            long sum = 0;
            for(int i = 0; i < multiplied.size(); i++) {
                sum += multiplied.get(i);
            }
            System.out.println("Sum: " + sum);

            //int sum = multiplied.stream().mapToInt(Integer::intValue).sum();
            //System.out.println("Sum: " + sum);

            //LongAdder longAdder = new LongAdder();
            //multiplied.parallelStream().forEach(longAdder::add);
            //System.out.println("Sum: " + longAdder.intValue());

        }
        else{
            if(start % multiplier[0] == 0 || start % multiplier[1] == 0) {
                multiplied.add(start);
                System.out.println(start);
            }
            start ++;
            getListOfMultiplesOfN(start);
        }
    }
}
