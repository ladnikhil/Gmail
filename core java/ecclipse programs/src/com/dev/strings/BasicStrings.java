package com.dev.strings;

public class BasicStrings {

	public static void main(String[] args) {
		
		String str = "hello";                // declaration of string
		System.out.println(str);
		
		String str1;
		str1 = "hello java";						 // declaration of string
		System.out.println(str1);
		
		
		
		String str2 =  new String("Hello world");			 // declaration of string
		System.out.println(str2);

		
		// for creating stringbuffer and string builder we need to create objects
		
		StringBuffer sb = new StringBuffer("StringBuffer");// creation of stringbuffer and it is threadsafe
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("StringBuilder"); // creation of stringbuilder and it is not threadsafe
		System.out.println(sb1);
		
		System.out.println(sb+" "+sb1); // we can concatinate two string using + operator
		
		System.out.println(sb.capacity()); // length of string + 16 is output of capacity
		
		
	}

}
