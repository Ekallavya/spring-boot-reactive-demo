package com.universe.bluestone.multithreading;

public class MyDeadlock {
	 
    static String str1 = "Java";
    static String str2 = "UNIX";

    public static void main(String a[]){
        Thread t1 = new Thread("My Thread 1"){
            public void run(){
                while(true){
                    synchronized(str1){
                        synchronized(str2){
                            System.out.println("My Thread 1 :"+str1 + str2);
                        }
                    }
                }
            }
        };
        Thread t2 = new Thread("My Thread 2"){
            public void run(){
                while(true){
                    synchronized(str2){
                        synchronized(str1){
                            System.out.println("My Thread 2 :"+str2 + str1);
                        }
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
