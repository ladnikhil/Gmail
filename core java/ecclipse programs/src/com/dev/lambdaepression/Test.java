package com.dev.lambdaepression;

public class Test {

	public static void main(String[] args) {
		
		// when we have lambda expression no need to override
		// this is java lambda expression
		FuncInt f = () -> {           // here FuncInt is name of an interface
			for(int i = 0;i<=10;i++) {
				System.out.println("i = "+i);
			}
		};
		
		f.printVal();// from funcint interface
		
	}

}
