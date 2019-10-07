package com.dev.threads;

public class SyncMainThread1 {

	public static void main(String[] args) throws InterruptedException {
		
		// if printer has non synchronizable class
		
		Printer1 p1 = new Printer1();
		
		Thread6 t6 = new Thread6(p1);
		t6.start();
		t6.join();
		
		new Thread6(p1).start();
		
	}

}
