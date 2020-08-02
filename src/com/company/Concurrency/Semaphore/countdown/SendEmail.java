package com.company.Concurrency.Semaphore.countdown;

import java.util.concurrent.CountDownLatch;

public class SendEmail implements Runnable {
    private CountDownLatch latch;

    public SendEmail(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println("send email started");
        Job.job();
        System.err.println("send email finished");
    }
}
