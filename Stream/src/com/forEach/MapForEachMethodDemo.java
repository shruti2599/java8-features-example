package com.forEach;

import java.util.HashMap;
import java.util.Map;

public class MapForEachMethodDemo {

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1,new Person("Rocky",3));
        map.put(2,new Person("Shruti",26));
        map.put(3,new Person("Leo",1));

        //for each loop

        System.out.println("Using for each loop .....");
        for(Map.Entry<Integer,Person> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getName());
            System.out.println(entry.getValue().getAge());

        }
        //Using lambda expression and forEach()

        System.out.println("Using lambda expression and forEach()........");

        map.forEach((K,v)-> {
            System.out.println(K);
            System.out.println(v.getName());
            System.out.println(v.getAge());
        });


        }
    }
