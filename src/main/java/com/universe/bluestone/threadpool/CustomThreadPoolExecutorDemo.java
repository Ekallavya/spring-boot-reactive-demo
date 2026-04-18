package com.universe.bluestone.threadpool;

import java.util.concurrent.*;

class CustomThreadPoolExecutorDemo
{
	static int poolSize = 3;
 
	static int maxPoolSize = 5;
 
	static long keepAliveTime = 10;
 
    static ThreadPoolExecutor threadpoolexecutor = null;
 
    static final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(1);
 
    
    public static void main(String args[])
    {
    	threadpoolexecutor = new ThreadPoolExecutor(poolSize, maxPoolSize,
                keepAliveTime, TimeUnit.SECONDS, queue);
    	
               
        for(int i = 1; i < 7 ; i++){
        	System.out.println(" Creating thread --> "+i);
        	threadpoolexecutor.execute(new Runnable()
             {
                 public void run()
                 {
                	try {
                		System.out.println(" Before Sleep "+Thread.currentThread().getName().toString());
						Thread.sleep(50000);
						System.out.println(" After Sleep "+Thread.currentThread().getName().toString());
					} catch (InterruptedException e) {
						System.out.println("InterruptedException "+e.getMessage());
						e.printStackTrace();
					}
                 }
             });   	
        }
        threadpoolexecutor.shutdown();
        System.out.println("Thread Pool Shutdown Done..");
        
        System.out.println("Program End.");
    }
 
}