package Fibonacci;

import java.util.Arrays;

public class Fibonacci {
    public static long[] generateFibonacci(int n) {
        long[] fibonacciArray = new long[n];
        // Check if n is less than 1
        if (n < 1) {
            return fibonacciArray; // Return an empty array if n is less than 1
        }

        // Generate the Fibonacci sequence
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
        int n = 10; // Number of elements in the Fibonacci sequence
        long[] fibonacciArray = generateFibonacci(n);

        System.out.println("First " + n + " elements of the Fibonacci sequence:");
        System.out.println(Arrays.toString(fibonacciArray));

        int nthElement = 5; // Find the 5th element of the Fibonacci sequence
        long nthFibonacci = fibonacci(nthElement);
        System.out.println("The " + nthElement + "th element of the Fibonacci sequence is: " + nthFibonacci);
    }
}
