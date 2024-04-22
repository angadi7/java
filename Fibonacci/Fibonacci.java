package Fibonacci;

import java.util.Arrays;

public class Fibonacci {
    public static long[] generateFibonacci(int n) {
        long[] fibonacciArray = new long[n];
        
        if (n < 1) {
            return fibonacciArray; 
        }

        
        for (int i = 0; i < n; i++) {
            fibonacciArray[i] = fibonacci(i);
        }

        return fibonacciArray;
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; 
        long[] fibonacciArray = generateFibonacci(n);

        System.out.println("First " + n + " elements of the Fibonacci sequence:");
        System.out.println(Arrays.toString(fibonacciArray));

        int nthElement = 5; 
        long nthFibonacci = fibonacci(nthElement);
        System.out.println("The " + nthElement + "th element of the Fibonacci sequence is: " + nthFibonacci);
    }
}
