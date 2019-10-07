package com.dev.jpatestapp1.jpatestapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Retrieving {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;

		EntityManager em = null;
		
		//EntityTransaction tr = null;

		Movie mov = new Movie();

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");

			em = emf.createEntityManager();

			// to retrieve the data we have find method present in entity manager

			mov = em.find(Movie.class, 103);// returns object of movie class
			
			//System.out.println(mov.getClass());
			
			// another method to find a retrieve data
			
			//mov = em.getReference(Movie.class, 101);

			
			
			//em.close();// toclose al objects

			System.out.println("******************************");
			System.out.println("id of the movie is " + mov.getId());
			System.out.println("Name of the movie is " + mov.getName());
			System.out.println("Rating of the movie is " + mov.getRating());
			System.out.println("******************************");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			em.close();
		}

	}

}
