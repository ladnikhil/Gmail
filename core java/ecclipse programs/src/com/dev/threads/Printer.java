package com.dev.threads;

public class Printer {

	synchronized public void printVal(int i,String thread) { // we have used synchronized keyword before method to have output in ordered manner
		for (int j = 0; j <=i; j++) {
			System.out.println("thread: "+thread+" "+" j ="+j);
		}
	}
}
