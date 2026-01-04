package com.forEach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetForEachDemo {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("Shruti", 26));
        set.add(new Person("Rocky", 3));
        set.add(new Person("Leo", 1));

        System.out.println("Using for each loop .....");
        //for each loop
        for(Person person: set){
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }

        //Using lambda expression and forEach()

        System.out.println("Using lambda expression and forEach()........");

        set.forEach(person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

        System.out.println("Using Stream and forEach()........");
        //Using Stream and forEach()

        set.stream().forEach((person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }));
    }
}
