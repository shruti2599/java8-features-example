package com.lambda;

@FunctionalInterface
interface Animal{

    void sound();   //by default it is abstract method as no access specifier mentioned.

    // void bark(); //This line will give error as only one abstract method is allowed in Functional Interface.


    public static void eat(){
        System.out.println("Static Method....");
    }

    public static void play(){
        System.out.println("Static Method 2 ....");
    }

    public default void run(){
        System.out.println("Default Method....");
    }

    public default void sleep(){
        System.out.println("Default Method 2 ....");
    }

}
class FunctinalInterfaceExample implements Animal{

    @Override
    public void sound() {
        System.out.println("Abstract Method......");
    }

    public static void main(String[] args) {

        FunctinalInterfaceExample obj = new FunctinalInterfaceExample();
        obj.sound();
        obj.run();
        obj.sleep();
        Animal.play();
        Animal.eat();

    }
}
