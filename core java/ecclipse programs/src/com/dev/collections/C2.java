package com.dev.collections;

import java.util.HashSet;

public class C2 {

	public static void main(String[] args) {

		HashSet<Employee> hs = new HashSet<Employee>();

		Employee e = new Employee();
		e.setName("Nikhil");
		e.setId(1);
		e.setEmail("ladnikhil55@gmail.com");
		e.setPassword("1234");


		Employee e1 = new Employee();
		e1.setName("siddesh");
		e1.setId(2);
		e1.setEmail("sid@gmail.com");
		e1.setPassword("123456");

		//for add operation 

		boolean b = hs.add(e);
		boolean b1= hs.add(e1);
		System.out.println("output after inserting elements : "+b+" "+b1);
		System.out.println(hs);


		// update emailid

		e.setEmail("nik@gmail.com");
		e1.setEmail("s@gmail.com");
		System.out.println("hashset after updating email is");
		System.out.println(hs);

		// deleting 

		boolean b2 = hs.remove(e1);
		System.out.println("output after deleting one object "+b2);
		System.out.println(hs);




 

	}

}
