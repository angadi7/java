package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);
 
        // Submit tasks for execution
        for (int i = 1; i <= 5; i++) {
            Runnable task = new Task("Task " + i);
            executor.submit(task);
        }
 
        // Shutdown the executor
        executor.shutdown();
    }
}
 
class Task implements Runnable {
    private String name;
 
    public Task(String name) {
        this.name = name;
    }
 
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing " + name);
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + " finished " + name);
    }
}
