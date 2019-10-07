package com.ust.ustglobalspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.ustglobalspringcore.autowiring.Author;
import com.ust.ustglobalspringcore.beans.HelloWorld;

public class MainAuthorClass {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("author.xml");
		
		System.out.println("==============================================");
		// this is for using autowire by type
		System.out.println("byType will check for type of authow and here we have pen and pencil but at atime of execution we have only pen so pen will execute");
		
		Author author = context.getBean(Author.class);
		System.out.println(author.getName()); // just to get value of property 
		author.getWrite().write();  // getting write method automatically by autowiring author with pencil byType because we have only pencil type open in this case
		
		
		System.out.println("==============================================");
		
		System.out.println("typebyname will search for variable name in bean class");
		
		System.out.println("==============================================");
		
		// here we have scanned package of bean and this gives output
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.getAnimal().makeSound();
		
		
	}

}
