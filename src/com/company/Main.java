package com.company;


import com.company.Concurrency.Semaphore.MyRun;
import com.company.Concurrency.Semaphore.countdown.IndexEmail;
import com.company.Concurrency.Semaphore.countdown.SendEmail;
import com.company.Concurrency.Semaphore.countdown.VirusCheck;
import com.company.generics.genericMethod;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        countDown();
        //semaphor();
        //mymap();
    }

    private static void countDown() {
        CountDownLatch latch =new CountDownLatch(2);
        new Thread(new SendEmail(latch)).start();
        new Thread(new VirusCheck(latch)).start();
        new Thread(new IndexEmail(latch)).start();
    }

    private static void semaphor() {
        Semaphore semaphore =new Semaphore(5);
        MyRun run = new MyRun(semaphore);
        for (int i=0;i<10;++i)
            new Thread(run).start();
    }


    private static void mymap() {
        genericMethod gene =new genericMethod();
        System.out.println(gene.add(2,3));
//        MyMap<String,String> myMap=new MyMap<>(10);
//        myMap.put("nima","abdpoor");
//        myMap.put("mehdi","golbaz");
//        myMap.put("ali","moradi");
//        myMap.put("asad","asadi");
//        myMap.put("hasan","naghavi");
//        System.out.println(myMap.get("nima"));
//        System.out.println(myMap.get("hasan"));
//        System.out.println(myMap.get("nima"));
//        System.out.println(myMap.get("ali"));
//        System.out.println(myMap.get("mehdi"));
    }

}