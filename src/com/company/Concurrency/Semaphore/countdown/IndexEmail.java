package com.company.Concurrency.Semaphore.countdown;

import java.util.concurrent.CountDownLatch;

public class IndexEmail implements Runnable {
    public IndexEmail(CountDownLatch latch) {
        this.latch = latch;
    }

    private CountDownLatch latch;
    @Override
    public void run() {
        System.err.println("index check started");
        Job.job();
        System.err.println("index check finished");
        latch.countDown();
        Job.job();
        System.err.println("index check finalized");
    }
}
