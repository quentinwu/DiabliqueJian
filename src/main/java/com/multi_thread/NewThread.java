package com.multi_thread;

/**
 * Created by quentin on 10/8/2017.
 */
public class NewThread implements Runnable {
    private String threadName;
    public Thread t;

    NewThread(String tname) {
        this.threadName = tname;
        t = new Thread(this, threadName);
        System.out.println(threadName + ": " + t);
        t.start(); // This starts the run method
    }


    // This is the entry point for the second thread
    public void run() {
        try {
            for(int i = 5; i> 0; i--) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(threadName + " interrupted");
        }
        System.out.println(threadName + " exiting.");
    }
}
