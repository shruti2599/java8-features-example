package com.lambda;

interface Addable{
    int addition(int a, int b);
}

//Traditional Way
class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}

public class LambdaParameter {

    public static void main(String[] args) {

        //Traditional Way
        AddableImpl obj = new AddableImpl();
        int result = obj.addition(10,20);
        System.out.println("Addition using OOP : "+result);
        // ////////////////////////////////////////////////////////

        //Lambda Expression
        Addable addition = (a, b) -> (a+b);
        int res = addition.addition(10,40);
        System.out.println("Addition using Lambda Expression : "+res);

    }
}
