package com.company;


import com.company.generics.MyMap;

public class Main {

    public static void main(String[] args) {
        mymap();
    }

    private static void mymap() {
        MyMap<String,String> myMap=new MyMap<>(10);
        myMap.put("nima","abdpoor");
        myMap.put("mehdi","golbaz");
        myMap.put("ali","moradi");
        myMap.put("asad","asadi");
        myMap.put("hasan","naghavi");
        System.out.println(myMap.get("nima"));
        System.out.println(myMap.get("hasan"));
        System.out.println(myMap.get("nima"));
        System.out.println(myMap.get("ali"));
        System.out.println(myMap.get("mehdi"));
    }
}