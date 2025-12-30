package com.lambda.functional_interfaces;

import java.util.function.Function;

/*
//Traditional way - OOPs

class FunctionImpl implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return (s.length());
    }
}
*/
public class FunctionInterfaceExample {

    public static void main(String[] args) {

    //  Function<String, Integer> function = new FunctionImpl();
    //  System.out.println("String length using OOPs "+function.apply("Shruti"));

        Function<String, Integer> function = (s) -> (s.length());
        System.out.println("String length using Lambda Expression is "+ function.apply("Shruti"));
    }
}
