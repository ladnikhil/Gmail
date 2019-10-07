package com.dev.ustglobal.jpql;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dev.jpatestapp1.jpatestapp1.Movie;

import antlr.collections.List;

public class AllRecords {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;

		EntityManager em = null;

		
		
		

		
		try {
			
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			
			em = emf.createEntityManager();
			
			String jpql = "from Movie";
			
			Query que = em.createQuery(jpql);// here we have created query
			
			// now we need to execute it
			
			List<Movie> rl =  que.getResultList();// to store result in movie
			
			for(Movie mov: rl) {
				System.out.println("==============================");
				System.out.println("id is"+mov.getId());
				System.out.println("name is"+mov.getName());
				System.out.println("rating is "+mov.getRating());
				System.out.println("==============================");
			}
			
			
			
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
