package com.universe.bluestone.multithreading;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
  An Executor that provides methods to manage termination and methods 
  that can produce a Future for tracking progress of one or more asynchronous tasks. 

  An ExecutorService can be shut down, which will cause it to reject new tasks.
  Two different methods are provided for shutting down an ExecutorService.
  The shutdown method will allow previously submitted tasks to execute before terminating, 
  while the shutdownNow method prevents waiting tasks from starting and attempts to stop currently executing tasks. 
  Upon termination, an executor has no tasks actively executing, no tasks awaiting execution, 
  and no new tasks can be submitted. An unused ExecutorService should be shut down to allow reclamation of its resources
  */



public class DemoExecutorService {
	
	static int corePoolSize = 10;

	public static void main(String[] args) throws InterruptedException {
		
		/* FixedThreadPool :
		 * 
		 * Creates a thread pool that reuses a fixed number of threads operating on a shared unbounded queue. 
		 * At any point, at most nThreads threads will be active processing tasks. 
		 * If additional tasks are submitted when all threads are active, 
		 * they will wait in the queue until a thread is available. 
		 * If any thread terminates due to a failure during execution prior to shutdown, 
		 * a new one will take its place if needed to execute subsequent tasks. 
		 * The threads in the pool will exist until it is explicitly shutdown.
		 */
		ExecutorService excutorService = Executors.newFixedThreadPool(corePoolSize);
		
		excutorService.execute(new RunnableTask("Krish"));
		excutorService.execute(new RunnableTask("Krish"));
		excutorService.execute(new RunnableTask("Krish"));
		excutorService.execute(new RunnableTask("Krish"));
		
		excutorService.awaitTermination(10000, TimeUnit.NANOSECONDS);
		excutorService.isTerminated();
		excutorService.isShutdown();
		excutorService.shutdown();
		
	
		
		/* CachedThreadPool :
		 * 
		 * Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads 
		 * when they are available. These pools will typically improve the performance of programs that execute 
		 * many short-lived asynchronous tasks. Calls to execute will reuse previously constructed threads if available. 
		 * If no existing thread is available, a new thread will be created and added to the pool. 
		 * Threads that have not been used for sixty seconds are terminated and removed from the cache. 
		 * Thus, a pool that remains idle for long enough will not consume any resources. 
		 * Note that pools with similar properties but different details (for example, timeout parameters) 
		 * may be created using ThreadPoolExecutor constructors.
		 * 
		 */ 
		
		excutorService = Executors.newCachedThreadPool();
		
		for (int i=1; i <10; i++){
			excutorService.execute(new RunnableTask("Arjun"));
			
		}
		/*
		 * SingleThreadScheduledExecutor :
		 * 
		 * Creates a single-threaded executor that can schedule commands to run after a given delay, 
		 * or to execute periodically. (Note however that if this single thread terminates due to a failure 
		 * during execution prior to shutdown, a new one will take its place if needed to execute subsequent tasks.) 
		 * Tasks are guaranteed to execute sequentially, and no more than one task will be active at any given time. 
		 * Unlike the otherwise equivalent newScheduledThreadPool(1) the returned executor is guaranteed not to be 
		 * reconfigurable to use additional threads.
		 * */
		
		excutorService = Executors.newSingleThreadScheduledExecutor();
		
		for (int i=1; i <10; i++){
			excutorService.execute(new RunnableTask("Karn"));
			
		}
		
		/* ScheduledThreadPool:
		 * 
		 * Creates a thread pool that can schedule commands to run after a given delay, or to execute periodically.
		 * corePoolSize the number of threads to keep in the pool, even if they are idle.
		 * */

		excutorService = Executors.newScheduledThreadPool(corePoolSize);
		
		for (int i=1; i <10; i++){
			excutorService.execute(new RunnableTask("Abhi"));
			
		}
		
		
		
		excutorService = Executors.newCachedThreadPool();
		
		
		
		for (int i=1; i <100; i++){
			excutorService.execute(new RunnableTask("Arjun"));
			
		}
		
		excutorService.shutdown();
		
		excutorService = Executors.newCachedThreadPool();
		
		
		for (int i=1; i <100; i++){
			excutorService.execute(new RunnableTask("Shiva"));
			
		}
		
		List<Runnable> incompleteList = excutorService.shutdownNow();
		
		System.out.println("Pending Tasks:"+ incompleteList.size());
		
		System.out.println("Program End");

	}

}
