package com.dev.Regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DigitsMatching {

	public static void main(String[] args) {
		
		Pattern pat = Pattern.compile("\\W\\d{2}\\W\\d{10}"); // for phone numbers--- here d{2} is only to allow 2 digits
		Matcher mat = pat.matcher("+91-9800000000");
		System.out.println(mat.matches());
		
		pat = Pattern.compile("\\d{1,2}\\W\\w{3}\\W\\d{2,4}");//{1,2} its ranging from 1 to 2 
		mat = pat.matcher("01-Jan-96"); // for date of birth or hire dates
		System.out.println(mat.matches());
		
		pat = Pattern.compile("[1-9]|1[0-9]|2[0-9]"); // it is used to give value from 0 to 30 here 1[0-9] for 11 to 20 and 2[0-9] for 21 to 29
		mat = pat.matcher("29");
		System.out.println(mat.matches());

	}
    
	
	
}
