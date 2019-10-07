package com.dev.threads;

public class Printer1 {

	 public void printVal(int i,String thread) { 
		for (int j = 0; j <=i; j++) {
			System.out.println("thread: "+thread+" "+" j ="+j);
		}
	}
}
