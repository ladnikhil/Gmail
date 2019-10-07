package com.dev.jpatestapp1.jpatestapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Reattachment {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;

		EntityManager em = null;

		EntityTransaction tr = null;

		Movie mov = new Movie();

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");

			em = emf.createEntityManager();

			// to retrieve the data we have find method present in entity manager

			mov = em.find(Movie.class, 101);// returns object of movie class

			System.out.println("object are persent "+em.contains(mov)); // it checks object is present or not and returns boolean value

			em.detach(mov);// todetach a object

			System.out.println("object are persent after detach"+em.contains(mov));

			tr = em.getTransaction();

			tr.begin();

			mov.setId(103);
			mov.setName("chakde india");
			mov.setRating("excellent");
			
			mov = em.merge(mov);// to merge again the object after detacch
			System.out.println("object after using merge method "+em.contains(mov));
			System.out.println("data has been updated succussfully after detaching and merging");
			
			tr.commit();

			// em.close();// toclose al objects
//
//			System.out.println("******************************");
//			System.out.println("id of the movie is " + mov.getId());
//			System.out.println("Name of the movie is " + mov.getName());
//			System.out.println("Rating of the movie is " + mov.getRating());
//			System.out.println("******************************");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			em.close();
		}

	}

}
