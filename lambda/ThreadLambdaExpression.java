package com.lambda;

//Traditional way - OOPs
class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run() method is started using OOP....");
    }
}

public class ThreadLambdaExpression {

    public static void main(String[] args) {

        //Traditional way - OOPs
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        // ///////////////////////////////////////////////

        //Lambda Expression

        Runnable runnable = () -> System.out.println("run() method is started using Lambda Expression....");
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
