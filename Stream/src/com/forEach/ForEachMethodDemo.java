package com.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodDemo {

    public static void main(String[] args) {
        List<Person> person = new ArrayList<Person>();
        person.add(new Person("Shruti", 26));
        person.add(new Person("Rocky", 3));
        person.add(new Person("Leo", 1));

        //without java8
        for(Person p : person){
            System.out.println(p.getName()+" -> "+p.getAge());
        }

        //With java8- Lambda Expression

        person.forEach(person1-> System.out.println(person1.getName()+" -> "+person1.getAge()));

        //With java8- Stream

        person.stream().forEach(System.out::println);

        person.stream().forEach(person1-> System.out.println(person1.getName()+" -> "+person1.getAge()));


    }

}
