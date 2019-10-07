package com.dev.threads;

public class Thread2 extends Thread {

	// here we are implementing threads with extends thread class
	@Override
	public void run() {
		System.out.println("T2 thread started");
		
		System.out.println("Thread2  is printing the value of j");
		for (int j = 0; j <= 10; j++) {
			System.out.println("j = "+j);
		}
		
		System.out.println("T2 thread terminated");
	}
	public static void main(String[] args) {
		

	}

}
