package com.ust.ustglobalspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.ustglobalspringcore.beans.HelloWorld;
import com.ust.ustglobalspringcore.config.SpringConfig;

public class ComponentScanApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		 
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.getAnimal().makeSound();

	}

}
