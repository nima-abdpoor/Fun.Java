package com.company.Concurrency.Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Execute {
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            for (int i=0;i<4;++i)
            System.err.println(Thread.currentThread().getId()+" : "+i);
        }
    };
    public void executeThreadPool(int number){
        Executor executor = Executors.newFixedThreadPool(number);
        for (int i=0;i<3;++i)
            executor.execute(this.runnable);
        return;
    }
    public void executeSingleThread(){
        Executor executor = Executors.newSingleThreadExecutor();
        for (int i=0;i<3;++i)
            executor.execute(this.runnable);
        return;

    }
    public void executeCachedPool(){
        Executor executor = Executors.newCachedThreadPool();
        for (int i=0;i<3;++i)
            executor.execute(this.runnable);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.execute(runnable);
    }

}
