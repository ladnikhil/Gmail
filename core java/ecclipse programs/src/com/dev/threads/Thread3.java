package com.dev.threads;

public class Thread3 implements Runnable{

	public static void main(String[] args) {
		

	}

	// here we are implementing threads with irunnable interface
	@Override
	public void run() {
		System.out.println("T3 thread started");
		
		System.out.println("Thread2  is printing the value of k");
		for (int k = 0; k <= 10; k++) {
			System.out.println("k = "+k);
		}
		
		System.out.println("T3 thread terminated");
		
	}

}
