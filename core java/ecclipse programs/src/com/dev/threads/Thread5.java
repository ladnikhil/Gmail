package com.dev.threads;

public class Thread5 extends Thread{


	Printer p;// REFERENCE VARIABLE TO PRINTER CLASS

	public Thread5(Printer pref) {
		p = pref;
	}

	@Override
	public void run() {
		p.printVal(10,"Thread5");
	}
}
