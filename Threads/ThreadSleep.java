package com.java.Threads;


import java.util.Date;

class ThreadsleepDemo extends Thread{
	
	private String threadName;
	
	ThreadsleepDemo(String name){
		threadName = name;
		System.out.println("Creating Thread");
	}
	
	public void printTime() {
		Date dateTime = new Date();
		String str = String.format("Time: %tc", dateTime);
		System.out.println(str);
		
	}
	
	public void run() {
		System.out.println("Thread Running " + threadName);
		try {
			for(int i=0;i<3;i++) {
				printTime();
				Thread.sleep(10000);
			}
		}catch(InterruptedException e) {
			System.out.println("Interrupted Exception" + threadName);
		}
	}
	
}

public class ThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadsleepDemo threadsleep = new ThreadsleepDemo("MyThread");
		threadsleep.start();
	}

}
