package com.functionalprogramming;

public class StringLength {
    public static void main(String[] args) {
        // Using a traditional method
        int length = getStringLength("Hello, World!");
        System.out.println("Length: " + length);

        // Using a lambda expression
        StringLengthInterface stringLengthLambda = (s) -> {
            int len = s.length();
            System.out.println("Length: " + len);
            return len;
        };
        
        // Execute the lambda
        length = stringLengthLambda.getLength("Hello, World!");
    }

    public static int getStringLength(String s) {
        int length = s.length();
        System.out.println("Length: " + length);
        return length;
    }

    @FunctionalInterface
    interface StringLengthInterface {
        int getLength(String s);
    }
}
