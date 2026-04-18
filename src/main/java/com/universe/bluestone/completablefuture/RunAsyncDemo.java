package com.universe.bluestone.completablefuture;

public class RunAsyncDemo {

    public static void main(String[] args) {

        System.out.println("main thread started");

        Runnable task1 = ()->{
            System.out.println("task1 started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task1 completed");
        };

        Runnable task2 = ()->{
            System.out.println("task2 started");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task2 completed");
        };

        Runnable task3 = ()->{
            System.out.println("task3 started");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task3 completed");
        };

        java.util.concurrent.CompletableFuture.runAsync(task1);
        java.util.concurrent.CompletableFuture.runAsync(task2);
        java.util.concurrent.CompletableFuture.runAsync(task3);

        System.out.println("main thread completed");

    }
}
