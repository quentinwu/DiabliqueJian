package com.scannerdemo;


import java.util.Scanner;
/**
 * Created by quentin on 5/27/2021.
 */
public class PlayWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int cnt = 0;
        while(sc.hasNext()) {
            String s1 = sc.next();
            if(s1.equals("quit") || s1.equals("exit")) {
                break;
            }
            // Operations
            s1 = "I've got " + s1 + " " + cnt;
            System.out.println(s1);
            cnt ++;
        }
        System.out.println("I'm done!");
    }
}
