package com.multi_thread;

import com.math.PrimeNumber;

/**
 * Created by quentin on 11/24/2017.
 */
public class MathThread implements Runnable {
    private String threadName;
    public Thread t;

    public MathThread(String tname) {
        this.threadName = tname;
        t = new Thread(this, threadName);
        System.out.println(threadName + ": " + t);
        t.start(); // This starts the run method
    }


    // This is the entry point for the second thread
    public void run() {
        PrimeNumber pn = new PrimeNumber(2, 1000);
        System.out.println(threadName + " exiting.");
    }
}