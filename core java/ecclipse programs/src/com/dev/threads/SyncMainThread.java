package com.dev.threads;

public class SyncMainThread {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("sync main started");
		
		Printer p = new Printer();// callling is done by creating object of class
		
		
		// for calling thread4 and making output execute one after other thread
		Thread4 t4 = new Thread4(p);
		t4.start();
		//t4.join(); // display output in proper manner//it waits for a thread to die
		
		// for calling thread 5
		new Thread5(p).start();// calling the thread
		
		// when we do not use synchronized keyword
		
		
		
		System.out.println("syncmain terminated");

	}

}
