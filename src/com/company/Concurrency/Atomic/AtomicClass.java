package com.company.Concurrency.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClass {
    int number;
    Object object;
    public void Usage(int number){
        this.number = number;
        AtomicInteger atomicInteger =new AtomicInteger(number);
        number = atomicInteger.addAndGet(2);
        print(number);
        number = atomicInteger.decrementAndGet();
        print(number);
        object = atomicInteger.compareAndExchange(number+1,number);
        print(object);
        object = atomicInteger.compareAndExchange(number,number);
        print(object);
        print(atomicInteger.compareAndSet(number,20));
    }

    private void print(Object number) {
        System.out.println(number);
    }
}
