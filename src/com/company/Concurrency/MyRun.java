package com.company.Concurrency;

import java.util.concurrent.Semaphore;

public class MyRun implements Runnable {
    Semaphore semaphore;

    public MyRun(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            String id = Thread.currentThread().getName();
            System.out.println(id + ":Started");
            function();
            System.out.println(id + ":finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }

    private void function() throws InterruptedException {
        Thread.sleep(100);
    }
}
