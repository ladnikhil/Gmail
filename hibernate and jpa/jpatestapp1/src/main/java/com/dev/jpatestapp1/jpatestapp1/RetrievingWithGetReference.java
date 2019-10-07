package com.dev.jpatestapp1.jpatestapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
public class RetrievingWithGetReference {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;

		EntityManager em = null;

		Movie mov = new Movie();
		Movie mov1 = new Movie();

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");

			em = emf.createEntityManager();

			// to retrieve the data we have find method present in entity manager

//			mov = em.find(Movie.class, 121);
//			System.out.println(mov.getClass());
			

			//mov = em.getReference(Movie.class, 101);
			//System.out.println(mov.getClass());//  here we will get proxy object

			mov1 = em.getReference(Movie.class, 102);

			System.out.println("******************************");
			System.out.println("id of the movie is " + mov.getId());
			System.out.println("Name of the movie is " + mov.getName());
			System.out.println("Rating of the movie is " + mov.getRating());
			System.out.println("******************************");
			

			System.out.println("******************************");
			System.out.println("id of the movie is " + mov1.getId());
			System.out.println("Name of the movie is " + mov1.getName());
			System.out.println("Rating of the movie is " + mov1.getRating());
			System.out.println("******************************");


		} catch (Exception e) {
 
			e.printStackTrace();
		} finally {
			em.close();
		}

	}


}


