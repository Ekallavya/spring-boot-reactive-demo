package com.universe.bluestone.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class BlockingQueueProducer implements Runnable {

	protected BlockingQueue<String> blockingQueue;

	public BlockingQueueProducer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	public void run() {
		try {
			Thread.sleep(500);			
			blockingQueue.put("Lion");
			Thread.sleep(1000);
			blockingQueue.put("Crocodile");
			Thread.sleep(2000);
			blockingQueue.put("Jaguar");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class BlockingQueueConsumer implements Runnable {
	protected BlockingQueue<String> blockingQueue;

	public BlockingQueueConsumer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	public void run() {
		try {
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class DemoBlockingQueue {
	public static void main(String[] args) throws Exception {
		//bounded queue - fixed size
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(1024);

		BlockingQueueProducer queueProducer = new BlockingQueueProducer(blockingQueue);
		BlockingQueueConsumer queueConsumer = new BlockingQueueConsumer(blockingQueue);

		new Thread(queueProducer).start();
		new Thread(queueConsumer).start();
	}
}
