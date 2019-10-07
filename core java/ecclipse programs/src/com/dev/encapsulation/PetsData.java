package com.dev.encapsulation;

public class PetsData {

	public static void main(String[] args) {
		
		Pets p1 = new Pets();
		Pets p2 = new Pets();
		Pets p3 = new Pets();
		
		p1.setPet("cat");
		p1.setPetname("Micky");
		p1.setAge(4);
		p1.setColor("white");
		
		
		p2.setPet("DOG");
		p2.setPetname("sheru");
		p2.setAge(5);
		p2.setColor("black");
		
		p3.setPet("parrot");
		p3.setPetname("john");
		p3.setAge(2);
		p3.setColor("green");
		
		Pets [] pet = { p1,p2,p3}; // here we have Pets as parent so we declare Pets here
		
		for(int i = 0;i<pet.length;i++) {
			System.out.println("pet is = "+pet[i].getPet());
			System.out.println("petname is = "+pet[i].getPetname());
			System.out.println("pet's age is = "+pet[i].getAge());
			System.out.println("pet's color is = "+pet[i].getColor());
			System.out.println("=========================");
		}
		
		
		
		
		
		

	}

}
