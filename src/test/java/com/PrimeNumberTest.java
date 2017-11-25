package com;

/**
 * Created by quentin on 11/24/2017.
 */
import com.basics.Outer;
import com.multi_thread.MathThread;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

public class PrimeNumberTest extends TestCase {
    public PrimeNumberTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite( PrimeNumberTest.class );
    }

    public void testAbc() {
        int numberOfThreads = 10;
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
        assertTrue(elapsed < 4000);
    }
}