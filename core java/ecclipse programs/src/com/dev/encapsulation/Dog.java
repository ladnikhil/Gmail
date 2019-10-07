package com.dev.encapsulation;

public class Dog implements Comparable <Dog>{ // comparable for c4 class
	
	@Override
	
	// for this we need to go to source and generate tostring
	public String toString() { // here we have overrided it for hasshsetclass
		return "Dog [age=" + age + ", name=" + name + ", breed=" + breed + ", color=" + color + "]";
	}
	private int age;  // hiding data members
	private String name;
	private String breed;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private String color;

	//// this override is for implements comparable<Dog>
	@Override
	public int compareTo(Dog d) {
		
		return (this.age -d.age);
	}
	

}
