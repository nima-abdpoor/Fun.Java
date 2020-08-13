package com.company.Java8.Lambda;

import com.company.people.Person;
import com.company.people.Student;

import java.util.*;

public class Compare {
    public void compare(){
        List<Person> people = Arrays.asList(
                new Student("nima",20),
                new Student("ali",32),
                new Student("Gholam",68)
        );
        Collections.sort(people,(a,b)-> a.age());
        for (Person p : people)
        System.out.println(p.getName());
    }
}