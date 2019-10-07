package com.dev.jpatestapp1.jpatestapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deletion {

	public static void main(String[] args) {
		
		// to delete a data from database

		EntityManagerFactory emf = null;

		EntityManager em = null;

		EntityTransaction tr = null;

		try {

			Movie mo = new Movie();

			emf = Persistence.createEntityManagerFactory("TestPersistence");

			em = emf.createEntityManager();

			tr = em.getTransaction();

			tr.begin();

			// for deleting a data from database

			mo = em.find(Movie.class, 102);// we should find which row to be found

			em.remove(mo);// remove method removes a record 

			System.out.println("record has been deleted");


			tr.commit();


		} catch (Exception e) {

			tr.rollback();

			e.printStackTrace();
		} finally {
			em.close();
		}

	}// end of main method

}// end of a class
