package com.stream;

import java.util.*;
import java.util.stream.*;

/**
 * Created by quentin on 1/22/2017.
 */

public class StreanDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i=1; i < 20; i++) {
            myList.add(i);
        }
        myList.add(59);
        myList.add(31);
        myList.add(312);
        myList.add(210);

        System.out.println("Original list: " + myList);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent()) {
            System.out.println("Minimum: " + minVal.get());
        }

    }
}
