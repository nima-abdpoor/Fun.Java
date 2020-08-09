package com.company.people;

public class Student extends Person {
    int age ;
    String name;
    public Student(String name , int age){
        this.age=age;
        this.name=name;
    }
    @Override
    public int age() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
