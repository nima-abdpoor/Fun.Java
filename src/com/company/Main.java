package com.company;


import com.company.Concurrency.MyRun;
import com.company.generics.genericMethod;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        semaphor();
        //mymap();
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