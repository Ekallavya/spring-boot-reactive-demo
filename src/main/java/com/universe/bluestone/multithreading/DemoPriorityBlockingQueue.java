package com.universe.bluestone.multithreading;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class PriorityBlockingQueueProducer implements Runnable {

	protected BlockingQueue<String> blockingQueue;
	final Random random = new Random();

	public PriorityBlockingQueueProducer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	public void run() {
		while (true) {
			try {
				String data = UUID.randomUUID().toString();
				System.out.println("Put: " + data);
				blockingQueue.put(data);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class PriorityBlockingQueueConsumer implements Runnable {

	protected BlockingQueue<String> blockingQueue;

	public PriorityBlockingQueueConsumer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	public void run() {
		while (true) {
			try {
				String data = blockingQueue.take();
				System.out.println(Thread.currentThread().getName()
						+ " take(): " + data);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class DemoPriorityBlockingQueue {
	public static void main(String[] args) {
		//unbounded Queue
		final BlockingQueue<String> priorityBlockingQueue = new LinkedBlockingQueue<String>();

		PriorityBlockingQueueProducer queueProducer = new PriorityBlockingQueueProducer(
				priorityBlockingQueue);
		new Thread(queueProducer).start();

		PriorityBlockingQueueConsumer queueConsumer1 = new PriorityBlockingQueueConsumer(
				priorityBlockingQueue);
		new Thread(queueConsumer1).start();

		PriorityBlockingQueueConsumer queueConsumer2 = new PriorityBlockingQueueConsumer(
				priorityBlockingQueue);
		new Thread(queueConsumer2).start();

	}
}
