package com.dev.collections;

import java.util.TreeSet;

import com.dev.encapsulation.Dog;

public class C4 {

	public static void main(String[] args) {
		
		TreeSet<Dog> ts = new TreeSet<Dog>();
		
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
		
		ts.add(d);
		ts.add(d1);
		ts.add(d2);
		//here we will not get output first as we need to implement comparable<dog> in dog class
		System.out.println(ts);// here the output will be ascending order 
	}

}
