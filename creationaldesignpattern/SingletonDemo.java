package com.creationaldesignpattern;

public class SingletonDemo {
    public static void main(String[] args) {
        // Get the only object available
        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();

        // Print the hash code of the instances to show they are the same
        System.out.println("Hashcode of singletonInstance1: " + singletonInstance1.hashCode());
        System.out.println("Hashcode of singletonInstance2: " + singletonInstance2.hashCode());

        // Check if both references point to the same instance
        if (singletonInstance1 == singletonInstance2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}
