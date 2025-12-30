package com.lambda.functional_interfaces;

import java.util.function.Consumer;

/*
//Traditional way - OOPs
class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
*/

public class ConsumerInterfaceExample {

    public static void main(String[] args) {

    //  Consumer<String> consumer = new ConsumerImpl();
    //  consumer.accept("Hello Shruti!...using OOPs");

     //Lambda Expression

     Consumer <String> consumer = (s) -> System.out.println(s);
     consumer.accept("Hello Shruti!....using Lambda Expression");
    }

}
