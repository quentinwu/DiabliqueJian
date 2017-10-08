package com.multi_thread;

/**
 * Created by quentin on 10/8/2017.
 */
public class CurrentThread {

    public static void main(String[] args) {

        NewThread one = new NewThread("One");
        NewThread two = new NewThread("Two");
        NewThread three = new NewThread("Three");

        Thread t = Thread.currentThread();
        t.setName("Main Thread");

        System.out.println("Name: " + t.getName() + " State: " + t.getState());

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(100);
                //t.sleep(100);
                System.out.println("State now: " + t.getState());
            }

            System.out.println("Waiting for child threads to finish");
            one.t.join();
            two.t.join();
            three.t.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
