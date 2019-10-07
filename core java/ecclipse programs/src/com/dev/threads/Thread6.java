package com.dev.threads;

public class Thread6 extends Thread{
	
	

	Printer1 p1;// REFERENCE VARIABLE TO PRINTER CLASS
	
	public  Thread6(Printer1 pref1) {
		p1 = pref1;
	}

	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(500);// to get output in proper manner 
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		p1.printVal(10,"Thread4");
	}
	public static void main(String[] args) {
		

	}

}
