package com.dev.strings;

public class StringM {

	public static void main(String[] args) {

		String str = "Hello Nikhil";

		String str1 = "Hello sid";
		
		int a = str.length();
		System.out.println("length of string str is = "+a);
		
		
		char b = str.charAt(2);
		System.out.println("character at index 2 is = "+b);
		
		char[] c = str.toCharArray();
		System.out.println("output of chararray = "+c[2]);
		
		boolean d= str.equals(str1);
		System.out.println("output of equals = "+d);
		
		boolean e = str.equalsIgnoreCase(str1);
		System.out.println("output of equalsignorecase = "+e);

	}

}
