package com.dev.collections;

import java.util.HashSet;

import com.dev.encapsulation.Dog;

public class C1 {

	public static void main(String[] args) {

		HashSet<Dog> hs = new HashSet<Dog>();

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
		d2.setAge(2);
		d2.setBreed("doberman");
		d2.setName("Nikkie");
		d2.setColor("white and black");  

		// to update any data

		d.setAge(10);
		d1.setAge(11);
		System.out.println(hs);



		boolean b  = hs.add(d);// here we have added d object to hashset
		boolean b1 = hs.add(d1);
		boolean b3 = hs.add(d2);
		System.out.println("output of add() method = "+b+" "+b1+" "+b3);
		System.out.println(hs);
		System.out.println("size of hashset hs: "+hs.size());// gives size of hasset 
		
		System.out.println("====for each loop=======");
		
		// here it iterates through collections one by one
		
		for(Dog dog: hs) {        // here Dog is class and dog is array created and it is iterating hs 
			System.out.println(dog);
		}

		System.out.println("====for each loop=======");
		
		boolean b2 = hs.remove(d);  // here we have removed the objects
		System.out.println("output of remove() method = "+b2);
		System.out.println(hs);

		// here as we have removed the value of b2 object it returns false
		System.out.println("output of contains : "+hs.contains(d));

		// gives size of hasset
		System.out.println("size of hashset hs: "+hs.size()); 



		// clear all the objects inside hashset
		hs.clear();
		System.out.println("size of hashset hs after clear(): "+hs.size());// gives size of hasset 




	}

}
