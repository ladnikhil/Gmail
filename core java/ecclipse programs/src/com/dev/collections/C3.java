package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Dog;

public class C3 {

	public static void main(String[] args) {
		
		HashMap<String, Dog> hm = new HashMap<String, Dog>();
		
		Dog d = new Dog();
		d.setAge(1);
		d.setBreed("doberman");
		d.setName("shiro");
		d.setColor("black");

		Dog d1 = new Dog();
		d1.setAge(2);
		d1.setBreed("doberman");
		d1.setName("Ronnie");
		d1.setColor("white");


		Dog d2 = new Dog();
		d2.setAge(3);
		d2.setBreed("doberman");
		d2.setName("Nikkie");
		d2.setColor("white and black");
		
		// if we are first time executing key for first time it will return null always
		hm.put("1", d);
		hm.put("2", d1);
		hm.put("3", d2);
		//Dog b = hm.put("1",d1);// here it returns object
		System.out.println(hm);

		// for remove method and return type  is object
		
		Dog f  = hm.remove("1");// here we have reomoved the objects of key 1
		System.out.println(f);
		System.out.println(hm);
		
		// checks whether key is present or not
		System.out.println("output of containskey() : "+hm.containsKey("2"));
		
		// checks whether value is present or not
		System.out.println("output of containsvalue() : "+hm.containsValue(d2));
		
		
	}
	
	

}
