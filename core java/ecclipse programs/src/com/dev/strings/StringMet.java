package com.dev.strings;

public class StringMet {

	public static void main(String[] args) {

		String str = "NIKHIL LAD";

		String str1 = "sid";

		int length = str.length(); // to get length of string


		// length method

		System.out.println("length of a string "+length);

		// tochararray method

		char[] ch = str.toCharArray();		// gives value at particular index
		System.out.println("first character is "+ch[0]);      // first character
		System.out.println("last character is "+ch[9]);     // last character

		// charat method   gives value at particular index

		char c = str.charAt(4); // fives value at index 4
		System.out.println("character at is "+c);

		// equals   checks both string are equal or not and returns boolean value

		boolean a = str.equals(str1);
		System.out.println("both strings are equal = "+a);

		// equalsIgnoreCase()  same as equals only ignores case

		boolean b = str.equalsIgnoreCase(str1);
		System.out.println("equals ignore case is = "+b);

		// contains checks particular character is present or not

		boolean e = str.contains("N");
		System.out.println("output of contains is  = "+e);

		// replace replaces a character with new character here case sensitivity matters

		String f = str.replace('N','S');
		System.out.println("output of replace is = "+f);

		// indexof gives index of particular character of first occurence and if character is not present it will return -1

		int g =  str.indexOf('L');
		System.out.println("outut of indexof = "+g);

		//touppercase is used to make strring uppercase

		String h = str.toUpperCase();
		System.out.println("output of uppercase is = "+h);

		//tolowercase is used to make string lowercase

		String l = str.toLowerCase();
		System.out.println("output of lowercase is = "+l);
		
		// substring to display only specific number of chareacters in the string  ---- will display characters after 3rd index
		
		String m = str.substring(3);
		System.out.println("output of a substring is = "+m);
		
		// same as substring only has starting and ending point --begining methods are included and last index is not includede
		
		String n = str.substring(2, 5);
		System.out.println("output osf substring(int,int) = "+n);

	}

}
