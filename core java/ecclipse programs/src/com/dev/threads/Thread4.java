package com.dev.threads;

public class Thread4 extends Thread{
	
	Printer p;// REFERENCE VARIABLE TO PRINTER CLASS
	
	public Thread4(Printer pref) {
		p = pref;
	}

	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(500);// to get output in proper manner 
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		p.printVal(10,"Thread4");
	}
	
}
