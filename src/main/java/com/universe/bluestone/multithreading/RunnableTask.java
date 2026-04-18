package com.universe.bluestone.multithreading;

public class RunnableTask implements Runnable{

	String name;
	
	public RunnableTask(String name){
		this.name = name;
	}
	
	public void run() {
		
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		for(int i=0;i<1000;i++);
		System.out.println("RunnableTask:"+SharedObject.getCounter()+":"+name);
		
	}

}
