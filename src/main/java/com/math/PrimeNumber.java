package com.math;

/**
 * Created by quentin on 11/24/2017.
 */
public class PrimeNumber {

    private int startWith;
    private int endWith;

    public PrimeNumber() {
        this.startWith = 2;
        this.endWith = 999999999;

        generatePrime();
    }

    public PrimeNumber(int startWith, int endWith) {
        this.startWith = startWith;
        this.endWith = endWith;

        generatePrime();
    }

    private void generatePrime() {
        for(int i = startWith; i <= endWith; i++) {
            for(int x = i-1; x > 1; x--) {
                if(i % x == 0) {
                    break;
                }
                if(x==2) {
                    System.out.println(i + " is a prime number");
                }
            }
        }
    }

}
