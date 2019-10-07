package com.dev.encapsulation;

public class DogData {
	
	//static int i = 0101;//whenever we write anything with zero we start thatwith octal
	
	static int i = 10;

	public static void main(String[] args) {
		
		
		
		
	
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		 
		
		d1.setAge(1);
		d1.setBreed("labradog");
		d1.setName("mick");
		
		d2.setAge(5);
		d2.setBreed("german shephard");
		d2.setName("john");
		
		d3.setAge(7);
		d3.setBreed("pub");
		d3.setName("nick");
		
		Dog [] dog = {d1,d2,d3}; // here Dog [] IS PARENT CLASS 
		
		for(int i =0;i<dog.length;i++) {
			System.out.println("name is = "+dog[i].getName());
			System.out.println("age  is = "+dog[i].getAge());
			System.out.println("breed  is = "+dog[i].getBreed());
			System.out.println("----------------------------------");
		}
		
		System.out.println(++i);//here first increment will occur and print
		//System.out.println(i++);
		
		

	}

}
