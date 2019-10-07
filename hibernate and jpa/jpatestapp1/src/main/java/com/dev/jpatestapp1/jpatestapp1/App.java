package com.dev.jpatestapp1.jpatestapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

public class App {
	public static void main(String[] args) {
		
		// for inserting data in databse using hibernate

		Movie mov = new Movie(); // object of mojo class to declare values
		mov.setId(1); // giving the values to private data members in mojo class(Movie class)
		mov.setName("Don");
		mov.setRating("Good");

		EntityTransaction tr = null;// in order to roll back we have return this

		EntityManagerFactory emf = null;

		EntityManager em = null;

		// for hibernate connections

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");

			// looks after all operations we need to perform and takes object form
			// entitymanagerfactory
			em = emf.createEntityManager();

			// in ordr to permanantly add data in data base and execute the operations
			tr = em.getTransaction();

			tr.begin();// to start transaction

			em.persist(mov);// to insert data in database we have method persist and need to pass mojo clas
			// object here

			System.out.println("saved records and inserted");

			// if we will not write code will be executed but it will not get daved in
			// datbase
			tr.commit(); // in ordr to permanantly add data in data base

		} catch (Exception e) {

			tr.rollback();// to roll back if exception occurs

			e.printStackTrace();
		} finally {
			em.close();// to close entity manager
		}

	}
}
