package com.dev.ustglobal.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sun.istack.internal.logging.Logger;

public class OneToOneTestApp {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setId(1);
		p.setName("Nikhil");
		
		VoterCard vo = new VoterCard();
		vo.setV_id(10);
		vo.setVname("aaaa");
		
		p.setVcard(vo);// here we have passes the reference of votercard class that we have created in personclass
		
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;
		
		try {
			
			emf = Persistence.createEntityManagerFactory("TestPersistence1");// persistance name of person
			em = emf.createEntityManager();
			tr = em.getTransaction();
			
			tr.begin();
			//em.persist(p);
			 
			// here we have created votercard reference because we need to find person from votercard id
			VoterCard vcard  = em.find(VoterCard.class, 10);// here we have given refernece that we have mapped and it is bidirectonal
			System.out.println("Name of voter u want "+vcard.getPer().getName());// here we have obtained name of voterid
			
			System.out.println("data has been saved");
			
			tr.commit();
			
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}finally {
			if(em!=null) {
				em.close();
			}
			
		}
				
		
	}

}
