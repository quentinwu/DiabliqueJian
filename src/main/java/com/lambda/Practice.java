package com.lambda;

import java.util.function.Predicate;

/**
 * Created by quentin on 1/16/2017.
 */
public class Practice {
    public static void main(String[] args) {

        MyInterface myInterface = (n, i) -> (98.5 / n) + i;
        System.out.println("Answer: " + myInterface.getValue(4, 100));

        TestInterface isDividable = (a, b) -> (a % b) == 0;
        System.out.println(isDividable.test(6, 2));
        TestInterface isLessThan = (a, b) -> a < b;
        System.out.println(isLessThan.test(2, 4));
        TestInterface absValuesSame = (a, b) -> (a < 0 ? -a : a) == (b < 0 ? -b : b);
        System.out.println(absValuesSame.test(-123, 123));

        absValuesSame = (a, b) -> a == b;
        System.out.println(absValuesSame.test(12, 12));

        TextInterface isContained;
        isContained = (a, b) -> a.matches(b);

        String myName = "Quentin Wu";
        System.out.println("Contained: " + isContained.test(myName, ".+Wu$"));

        NumericFunc smallestFactor;
        int dontChange = 10;
        smallestFactor = (n) -> {
            int result = 1;
            n = n < 0 ? -n : n;

            for(int i = 2; i <= n/i; i++) {
                if((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            int apple = dontChange;
            return result;
        };
        //dontChange = 13;
        System.out.println("Smallest factor: " + smallestFactor.func(12));
        System.out.println("Dont change " + dontChange);

        GenericTest<String> genericTest;
        genericTest = (a, b) -> a.contains(b);
        System.out.println("Contains: " + genericTest.test("Apple", "ppl"));

        GenericTest<Integer> genericTest1;
        genericTest1 = (a , b) -> a == b;
        System.out.println("Integer equals: " + genericTest1.test(100, 100));

        String checkWord = "APPLE";
        Predicate<String> containsApple = (a) -> {
            a = a.toUpperCase();
            boolean result = a.contains(checkWord);
            return result;
        };

        System.out.println(containsApple.test("apple pie is good"));
    }
}
