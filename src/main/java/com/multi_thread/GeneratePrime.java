package com.multi_thread;

import java.util.ArrayList;

/**
 * Created by quentin on 11/24/2017.
 */
public class GeneratePrime {

    public static void main(String[] args) {

        int numberOfThreads = 1;
        ArrayList<MathThread> mathThreads = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < numberOfThreads; i++) {
            mathThreads.add(new MathThread("Thread" + i));
        }

        Thread t = Thread.currentThread();
        t.setName("Main Thread");

        System.out.println("Name: " + t.getName() + " State: " + t.getState());

        try {
            System.out.println("Waiting for child threads to finish");
            for(MathThread mathThread : mathThreads) {
                mathThread.t.join();
            }
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted");
        }
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        System.out.println("Main thread exiting. Elapsed: " + elapsed + " ms");
    }
}