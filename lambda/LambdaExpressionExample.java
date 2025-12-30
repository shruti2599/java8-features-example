package com.lambda;


/*
Lambda Expression is an anonymous method which means method without name. It does not belong to any class.
Lambda expression is mainly used to implement Functional interfaces.
*/

interface Shape{

    void draw();
}

//traditional way OOPs

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle Shape is drawing using Object-oriented programming....");
    }
}
// ////////////////////////////////////////////////////////

public class LambdaExpressionExample {

    public static void main(String[] args) {

        //traditional way
        Rectangle rect = new Rectangle();
        rect.draw();
        // ////////////////////////////////////////////////////////

        //Lambda Expression
        // Passing LE as a value to refrence variable of type functional interface

        Shape rectangle = () -> System.out.println("Rectangle Shape is drawing using Lambda expression....");
        rectangle.draw();

        // Passing LE as a method parameter

        Shape circle = () -> System.out.println("Circle Shape is drawing using Lambda Expression....");
        print(circle);

        //Passing LE in method

        print(() -> System.out.println("Square Shape is drawing using Lambda Expression....."));

    }

    private static void print(Shape shape){
        shape.draw();;
    }
}
