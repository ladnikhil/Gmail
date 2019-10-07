package com.dev.jpatestapp1.jpatestapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updatation {

	public static void main(String[] args) {
		
		// for updating a recod in database
		
		
		EntityManagerFactory emf = null;
		
		EntityManager em  = null;
		
		EntityTransaction tr = null;
		
		Movie mo =  new Movie();
		
		try {
			
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			
			mo = em.find(Movie.class, 101);
			
			// to update a data we need to just set data
			mo.setName("3 idiots");
			mo.setRating("Excellent");
			System.out.println("data has been updated");
			
			tr.commit();
			
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}

	}

}
