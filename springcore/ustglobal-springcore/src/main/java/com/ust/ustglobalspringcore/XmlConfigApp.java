package com.ust.ustglobalspringcore;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.ustglobalspringcore.autowiring.Author;
import com.ust.ustglobalspringcore.autowiring.Pen;
import com.ust.ustglobalspringcore.beans.Animal;
import com.ust.ustglobalspringcore.beans.HelloWorld;
import com.ust.ustglobalspringcore.beans.Pet;

/**
 * Hello world!
 *
 */
public class XmlConfigApp 
{
    public static void main( String[] args )
    {
       HelloWorld obj1 = new HelloWorld();
       obj1.setMsg("Hello World");
       System.out.println(obj1.getMsg());
       
       System.out.println("============================================");
       
      // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       
       ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
       
       HelloWorld obj2 = context.getBean(HelloWorld.class);
       System.out.println(obj2.getMsg());
       
       System.out.println("=============for object wiring===============================");
       
       obj2.getAnimal().makeSound();
       
       System.out.println("=============for collection wiring===============================");
       
       System.out.println(obj2.getMap());

       // when we use wiring that is get object value of human because we have given referenc of human in property tag
       
       
       
       System.out.println("============================================");
       
       // here we are just calling animal interface with bean
		
		/*
		 * Animal animal = context.getBean(Animal.class); animal.makeSound();
		 */
		 
       System.out.println("============================================");
       
    // here we are just calling animal interface with bean but we want human so written in string
       
       Animal animal = (Animal) context.getBean("human");
       animal.makeSound();
       
       System.out.println("============================================");
     // here we are just calling animal interface with bean but we want dog so written in string
       
       Animal animal1 = (Animal) context.getBean("dog");
       animal1.makeSound();
       
      System.out.println("============================================");
     
       Pet pet = context.getBean(Pet.class);
       System.out.println(pet.getName());
       pet.getAnimal().makeSound();
       
       // for autowiring
       System.out.println("==============autowiring==============================");
       
//       Author author = context.getBean(Author.class);
//       author.getWrite();
      
       context.close();
       
       
       
       
       
    }
}
