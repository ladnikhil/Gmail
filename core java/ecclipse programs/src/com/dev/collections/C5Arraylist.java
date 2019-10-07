package com.dev.collections;

import java.util.ArrayList;

import com.dev.encapsulation.Dog;

public class C5Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Dog> ar = new ArrayList<Dog>(2);
		
		Dog d = new Dog();
		d.setAge(4);
		d.setBreed("doberman");
		d.setName("shiro");
		d.setColor("black");

		Dog d1 = new Dog();
		d1.setAge(6);
		d1.setBreed("doberman");
		d1.setName("Ronnie");
		d1.setColor("white");


		Dog d2 = new Dog();
		d2.setAge(5);
		d2.setBreed("doberman");
		d2.setName("Nikkie");
		d2.setColor("white and black");
		
		ar.add(d);
		ar.add(d1);
		ar.add(d2);
		
		System.out.println(ar);
		
		ar.trimToSize();// trims all whitespaces 
		
		System.out.println("size of arraylist after trimtosize : "+ar.size());
		
		
		
		

	}

}
