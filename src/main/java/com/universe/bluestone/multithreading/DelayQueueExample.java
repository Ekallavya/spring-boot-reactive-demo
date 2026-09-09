package com.universe.bluestone.multithreading;

import java.util.concurrent.DelayQueue;

public class DelayQueueExample {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayTask> queue = new DelayQueue<>();

        System.out.println("Submitting tasks...");
        // Add tasks with different delay times (unordered insertion)
        queue.put(new DelayTask("Task A (5 seconds delay)", 5000));
        queue.put(new DelayTask("Task B (2 seconds delay)", 2000));
        queue.put(new DelayTask("Task C (8 seconds delay)", 8000));

        System.out.println("Starting to consume tasks...\n");

        while (!queue.isEmpty()) {
            long startTime = System.currentTimeMillis();

            // This blocks until the lowest remaining delay hits 0
            DelayTask task = queue.take();

            long timeTaken = (System.currentTimeMillis() - startTime) / 1000;
            System.out.printf("Executed: %s (Waited %d seconds for it)%n",
                    task.getTaskName(), timeTaken);
        }
    }
}