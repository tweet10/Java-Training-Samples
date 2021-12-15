package com.java.Threads;



import com.java.samples.day5.newClass;

class DemoThread1 implements Runnable{

	private String threadName;
	
	DemoThread1(String name) {
		// TODO Auto-generated method stub
		threadName = name;
		System.out.println("Creating Thread");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<3;i++) {
				System.out.println("Running Child Thread in Loop" + threadName);
				Thread thread = new Thread();
				thread.start();
				Thread.sleep(20000);
			}
		}catch(InterruptedException e){
			System.out.println("Interrupted Exception" + threadName);
		}
	}
	
		public static void main(String[] args) {
		DemoThread1 demo = new DemoThread1("MyThread");
		demo.run();
	}
	
}
	
