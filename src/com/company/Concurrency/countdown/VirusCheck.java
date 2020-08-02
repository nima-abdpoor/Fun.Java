package com.company.Concurrency.countdown;

import java.util.concurrent.CountDownLatch;

public class VirusCheck implements Runnable {
    private CountDownLatch latch;

    public VirusCheck(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public void run() {
        System.err.println("virus check started");
        Job.job();
        System.err.println("virus check finished");
        latch.countDown();
        Job.job();
        System.err.println("virus check finalized");
    }
}
