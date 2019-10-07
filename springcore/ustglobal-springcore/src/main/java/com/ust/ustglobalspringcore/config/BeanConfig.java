package com.ust.ustglobalspringcore.config;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ust.ustglobalspringcore.beans.Animal;
import com.ust.ustglobalspringcore.beans.Dog;
import com.ust.ustglobalspringcore.beans.HelloWorld;
import com.ust.ustglobalspringcore.beans.Human;

@Configuration
public class BeanConfig {
	
	
	@Bean(name="obj")
	public HelloWorld getHelloWorld() {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMsg("Hello World");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz", 890);
		
		// for wiring dog
		
		helloWorld.setMap(map);
		//Animal animal = getDog();
		helloWorld.setAnimal(getDog());
		
		return helloWorld;
		
	}
	
	@Bean(name="dog")
	@Scope("prototype")
	public Dog getDog() {
		return new Dog();
	}
	
	
	@Bean(name="human")
	public Human getHuman() {
		return new Human();
	}
	
	

}
