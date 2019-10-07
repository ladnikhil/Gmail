package com.ust.ustglobalspringcore.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.ustglobalspringcore.config.BeanConfig;

public class AnnotationConfigApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		HelloWorld obj = context.getBean(HelloWorld.class);
		System.out.println(obj.getMsg());
		System.out.println(obj.getMap());
		
		System.out.println("===================================");
		
		// by autowiring
		
		obj.getAnimal().makeSound();
		
		
		// for scope
		
		System.out.println("===================================");
		
		/*
		 * Animal animal1 = context.getBean(Animal.class); Animal animal2 =
		 * context.getBean(Animal.class); System.out.println(animal1==animal2);
		 */
		
				Animal animal1 = (Animal) context.getBean("dog"); 
				Animal animal2 =(Animal) context.getBean("dog"); 
				System.out.println(animal1==animal2);
				 
		
		
		context.close();
	}

}
