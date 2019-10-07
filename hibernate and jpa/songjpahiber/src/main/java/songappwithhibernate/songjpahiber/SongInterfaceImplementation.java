package songappwithhibernate.songjpahiber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SongInterfaceImplementation implements SongInterface {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		SongInterfaceImplementation so = new SongInterfaceImplementation();

		// so.SongData();

		
//		System.out.println("enter any number to play all songs");
//		int i = sc.nextInt();
//
//		so.playAllSongs(i);
		
		
		
		//so.deleteSongs("asdasd");

		//so.updateSongs("asdasd");
		
		so.insertSongs("asdasd");
		
		//so.specificSongs();
		
		//so.jdbcSpecificSongs();
		
		//so.randomsong();
		
	}

	public void SongData() {

		Songs s = new Songs();
		s.setSid(1);
		s.setSongname("faded");
		s.setDescription("english song");

		Songs s1 = new Songs();
		s1.setSid(2);
		s1.setSongname("iktara");
		s1.setDescription("hindi song");

		Songs s2 = new Songs();
		s2.setSid(3);
		s2.setSongname("kabira");
		s2.setDescription("hindi song");

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tr = em.getTransaction();

			tr.begin();
			em.persist(s);
			em.persist(s1);
			em.persist(s2);

			tr.commit();

		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();

		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	public Songs playAllSongs(int id) {

		EntityManagerFactory emf = null;
		EntityManager em = null;

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();

			String jpql = "from Songs";
			Query que = em.createQuery(jpql);

			List<Songs> li = que.getResultList();

			for (Songs s : li) {
				System.out.println("==============");
				System.out.println(s.getSongname() + " is playing");
				System.out.println("==============");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new Songs();

	}

	public Songs updateSongs(String s) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;
		
		try {
			
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tr = em.getTransaction();

			tr.begin();
			

			String jpql = "update Songs set songname =:nm where sid =:id";
			Query que = em.createQuery(jpql);
			
			System.out.println("enter the name songs u want to update");
			String name = sc.nextLine();
			que.setParameter("nm", name);
			
			System.out.println("enter the id of the songs u want to update");
			int id = sc.nextInt();
			que.setParameter("id", id);
			
			int result = que.executeUpdate();
			System.out.println("data has been updated");
			
			tr.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new Songs();
	}

	public Songs deleteSongs(String s) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;
		
		try {
			
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			tr = em.getTransaction();

			tr.begin();
			

			String jpql = "delete from Songs where songname = :nm";
			Query que = em.createQuery(jpql);
			
			System.out.println("enter the name songs u want to delete");
			String name = sc.nextLine();
			que.setParameter("nm", name);
			
			int result = que.executeUpdate();
			System.out.println("data has been deleted");
			
			tr.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new Songs();
	}

	public Songs insertSongs(String s) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tr = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			//tr = em.getTransaction();

			//tr.begin();
			

			String jpql = ("insert into Songs (id,desc,name)values(:id , :desc , :name)");
			Query que = em.createNativeQuery(jpql);
			em.getTransaction().begin();
			

			System.out.println("enter the song id u want to insert");
			int id = sc.nextInt();
			que.setParameter(":id", id);
			
			System.out.println("enter the desc of the song");
			String desc = sc.nextLine();
			que.setParameter("desc", desc);
			
			
			
			System.out.println("enter the name of the song");
			String name = sc.nextLine();
			que.setParameter("nm", name);
			
			que.executeUpdate();
			
			
			//int result = que.executeUpdate();
			System.out.println("data has been inserted");
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new Songs();
	}

	public Songs specificSongs() {
		
		EntityManagerFactory emf = null;

		EntityManager em = null;

		EntityTransaction tr = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");

			em = emf.createEntityManager();

			String jpql = "select  from Songs where songname = :nm ";

			Query qu = em.createQuery(jpql);
			
			
			
			System.out.println("enter the name of the song");
			String name = sc.nextLine();
			qu.setParameter("nm", name);
			
			int result = qu.executeUpdate();

			List<String> rl =  qu.getResultList();// asname is written in string type
			
			


			for(String mov: rl) {
				
				System.out.println("name of song is"+mov);
				System.out.println("==============================");
			}

			
		} catch (Exception e) {
			
		}
		
		return new Songs();
	}

	public void jdbcSpecificSongs() {
		
		
		
		

		Connection conn = null;

		PreparedStatement pstmt = null;

		ResultSet rs  = null;
		
		
		
			// load a driver

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			System.out.println("driver class loaded");

			// get connection of db from connections


			String dbUrl = "jdbc:mysql://localhost:3306/songapp";

			System.out.println("enter the username and password");// taking username password as input 
			String user = sc.nextLine();
			String password = sc.nextLine();



			try {
				conn = DriverManager.getConnection(dbUrl,user,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// second method to create connections
			System.out.println("connection has been established");
			System.out.println("=============================");

			// issue a query

			String query = "select * from songtable where sid = ? and songname = ?";

			try {
				pstmt = conn.prepareStatement(query);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}//

			// get input from query

			System.out.println("enter user id ");
			try {
				pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			System.out.println("enter songname ");
			try {
				pstmt.setString(2,sc.nextLine());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			try {
				rs = pstmt.executeQuery();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}// when we use static and dynamic querires bothh we use executeQUERY()

			// to execute above select query we need result set and query

			try {
				while(rs.next()) {
					int userid = rs.getInt("sid"); 
					String username = rs.getString("songname"); 
					//String email = rs.getString("email");

					System.out.println("************************");
					System.out.println("entered user is ");


					System.out.println("userid = "+userid);
					System.out.println("username = "+username);
					//System.out.println("useremail = "+email);
					System.out.println("********************************************");

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
			}

	public void randomsong() {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;

		try {

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();

			String jpql = "from Songs order by rand()";
			Query que = em.createQuery(jpql);

			List<Songs> li = que.getResultList();

			for (Songs s : li) {
				System.out.println("==============");
				System.out.println(s.getSongname() + " is playing");
				System.out.println("==============");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
	}

}// end of class
