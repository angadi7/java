package com.functionalprogramming;

public class HelloWorld {
    public static void main(String[] args) {
        // Using a traditional method
        printHelloWorld();

        // Using a lambda expression
        Runnable helloWorldLambda = () -> System.out.println("Hello, World!");
        
        // Execute the lambda
        helloWorldLambda.run();
    }

    public static void printHelloWorld() {
        System.out.println("Hello, World!");
    }
}

