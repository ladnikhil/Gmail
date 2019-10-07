package com.dev.ustglobal.onetomanymapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToManyTestApp {

	public static void main(String[] args) {


		Pencils pe = new Pencils();
		pe.setPid(10);
		pe.setPname("abc");


		Pencils pe1 = new Pencils();
		pe1.setPid(20);
		pe1.setPname("xyz");
		ArrayList<Pencils> al = new ArrayList<Pencils>();
		al.add(pe);
		al.add(pe1);


		PencilBox pb = new PencilBox();
		pb.setBoxid(1);
		pb.setBoxname("apsara");
		pb.setPcl(al);

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistencepencilbox");
			em = emf.createEntityManager();
			tr = em.getTransaction();
			tr.begin();
			System.out.println("unidirectional");
			
			em.persist(pb);


			System.out.println("data has been saved");

			tr.commit();

		} catch (Exception e) {
			//tr.rollback();
			e.printStackTrace();
		}finally{
			if(em!=null) {
				em.close();
			}
		}






	}

}
