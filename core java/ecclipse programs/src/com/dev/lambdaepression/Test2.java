 package com.dev.lambdaepression;

public class Test2 {

	public static void main(String[] args) {
		
		// functional interface with no brackets
		FuncInt1 f = () -> System.out.println("this is functional interface without brackets");
		
		f.print();// calling functint1
		
		
		// functional interface with one normal logic
		
		
		
		
		
		
		
		FunctInt2 f1 = () -> {    // from functint f1
			for(int i = 0;i<=5;i++) {
			 i = i+1;
				System.out.println(i);
			}
		};
		
		f1.print();
		
		// functional interface with arguements
		
		FuncInt3 f2 = (int i) -> { // from functint 3
			for(int j = 1;j<=i;j++) {
				System.out.println(j);
			}
		};
		
		f2.printWithArguements(1);
		
		
		
	}

}
