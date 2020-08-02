package com.company.Concurrency.countdown;

public class Job {
    public static void job(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
