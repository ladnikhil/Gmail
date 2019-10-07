package com.dev.arrays;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		
		
		// for casting
		
		//csting is used to convert one datatype to another
		
		// if one data is bigger then other we can caste it ti same type
		
		int x = 40;
		byte j = (byte) x;  // here byte is converted into int by casting and it is done by ()
		System.out.println(j);
		
		// for scanner class
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		//System.out.println("enter any int");
		System.out.println("enter any string");
		
		//i = sc.nextInt();
		String s = sc.nextLine();
		
		//System.out.println(i);
		System.out.println(s);
		

	}

}
