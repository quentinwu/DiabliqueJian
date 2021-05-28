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
        int cnt = 0;
        for(int i = startWith; i <= endWith; i++) {
            String si = String.valueOf(i);
            if(si.endsWith("1") || si.endsWith("3") || si.endsWith("7") || si.endsWith("9")) {
                for (int x = i - 1; x > 1; x--) {
                    if (i % x == 0) {
                        break;
                    }
                    if (x == 2) {
                        cnt++;
                        System.out.println(i + " is a prime number " + cnt);
                    }
                }
            }
        }
    }

}
