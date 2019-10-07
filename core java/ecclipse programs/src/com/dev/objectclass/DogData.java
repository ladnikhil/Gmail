package com.dev.objectclass;

public class DogData {

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
		
		Dog [] dog = {d1,d2,d3};
		
		for(int i =0;i<dog.length;i++) {
			System.out.println("name is = "+dog[i].getName());
			System.out.println("age  is = "+dog[i].getAge());
			System.out.println("breed  is = "+dog[i].getBreed());
			System.out.println("----------------------------------");
		}
		
		//System.out.println(d1.equals(d2));
	}

}
