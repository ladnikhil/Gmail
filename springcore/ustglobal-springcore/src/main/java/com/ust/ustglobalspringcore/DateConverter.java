package com.ust.ustglobalspringcore;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateConverter {

	public static void main(String[] args) throws ParseException {
		
		String date = "15/08/1947";
		
		SimpleDateFormat s = new SimpleDateFormat("dd/mm/yyyy");
		
		Date d =  (Date) s.parse(date);
		System.out.println(d.toString());
	}
}
