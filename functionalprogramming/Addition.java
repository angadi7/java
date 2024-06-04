package com.functionalprogramming;

public class Addition {
    public static void main(String[] args) {
        // Using a traditional method
        int sum = add(5, 7);
        System.out.println("Sum: " + sum);

        // Using a lambda expression
        AdditionInterface additionLambda = (a, b) -> {
            int result = a + b;
            System.out.println("Sum: " + result);
            return result;
        };
        
        // Execute the lambda
        sum = additionLambda.add(5, 7);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        return sum;
    }

    @FunctionalInterface
    interface AdditionInterface {
        int add(int a, int b);
    }
}
