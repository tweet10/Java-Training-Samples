package com.java.Threads;

import java.util.Date;



class GreetingRunnable implements Runnable, ThreadDelay{

	private String greeting;
	private static final int REPETITION =10;
	//private static final int DELAY =1000;
	
	public GreetingRunnable(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=1;i<=REPETITION;i++) {
				Date now = new Date();
				System.out.println(now+ " "+ greeting);
				Thread.sleep(ThreadDelay.DELAY);
			}
		}
		catch(InterruptedException e){
			
		}
	}
	
}
public class GreetingRunnableSample { 
public static void main(String[] args) {
	// TODO Auto-generated method stub
	GreetingRunnable r1= new GreetingRunnable("Hello world");
	GreetingRunnable r2= new GreetingRunnable("Good Morning!!!");
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	t1.start();
	t2.start();
}

}
