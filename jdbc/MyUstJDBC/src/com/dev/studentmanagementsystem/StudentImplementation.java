package com.dev.studentmanagementsystem;

import java.io.FileReader;
import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class StudentImplementation implements Student {

	static Connection conn = null;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//StudentImplementation st = new StudentImplementation();

		//st.show();
		//st.add();
		//st.delete();
		//st.update();

	}


	@Override 
	public void add() {

		PreparedStatement pst  = null;

		// load a driver

		try {

			// load a driver

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver of add method loaded");

			// establish db connections

			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";

			System.out.println("enter the username and password");// taking username password as input 
			String user = sc.nextLine();
			String password = sc.nextLine();



			conn = DriverManager.getConnection(dbUrl,user,password);// second method to create connections
			System.out.println("connection of add method has been established");
			System.out.println("=============================");


			// issue a query

			String query = "insert into user_info values(?,?,?,?)";

			pst = conn.prepareStatement(query);

			// take input for query

			System.out.println("enter the username");
			pst.setString(1,sc.nextLine());

			System.out.println("enter the userid");
			pst.setInt(2,Integer.parseInt(sc.nextLine()));

			System.out.println("enter emailid");
			pst.setString(3,sc.nextLine());


			System.out.println("enter password");
			pst.setString(4,sc.nextLine());

			int count = pst.executeUpdate();

			// results of a query

			if(count>0) {
				System.out.println("query is ok"+count+" rows are affected");
			}else {
				System.out.println("their is a problem");
			}





		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			if(pst!=null) {
				try {
					pst.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}


	}

	@Override
	public void update()  {

		PreparedStatement pst  = null;

		try {

			// load a driver

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("update driver has been loaded");

			// establish connections with db using driver

			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
			String filepath = "C:\\Users\\acer\\Desktop\\db.properties";

			FileReader file = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(file);

			conn = DriverManager.getConnection(dbUrl,prop);// second method to create connections
			System.out.println("connection of delete method has been established");
			System.out.println("=============================");

			// issue a query

			String query = "update user_info set email = ? where userid = ? and password = ?";

			pst = conn.prepareStatement(query);

			// giving inputs to query

			System.out.println("enter email to be updated");
			pst.setString(1,sc.nextLine());

			System.out.println("enter the userid");
			pst.setInt(2,Integer.parseInt(sc.nextLine()));


			System.out.println("enter password");
			pst.setString(3,sc.nextLine());

			int count = pst.executeUpdate();

			// results of a query

			if(count>0) {
				System.out.println("query is ok"+count+" rows are affected");
			}else {
				System.out.println("their is a problem");
			}



		} catch (Exception e) {

			e.printStackTrace();
		}


	}

	@Override
	public void delete() {

		PreparedStatement pst  = null;

		try {
			// load a driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver of deleter method loaded");

			// connect bd connections via driver

			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
			String filepath = "C:\\Users\\acer\\Desktop\\db.properties";

			FileReader file = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(file);

			conn = DriverManager.getConnection(dbUrl,prop);// second method to create connections
			System.out.println("connection of add method has been established");
			System.out.println("=============================");


			// issue a query

			String query = "delete from  user_info where userid = ? and password = ?";

			pst = conn.prepareStatement(query);

			// take input for query


			System.out.println("enter the userid");
			pst.setInt(1,Integer.parseInt(sc.nextLine()));


			System.out.println("enter password");
			pst.setString(2,sc.nextLine());

			int count = pst.executeUpdate();

			// results of a query

			if(count>0) {
				System.out.println("query is ok"+count+" rows are affected");
			}else {
				System.out.println("their is a problem");
			}



		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			if(pst!=null) {
				try {
					pst.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public void show() {

		Statement stmt = null;

		ResultSet rst = null;

		// load a driver 

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver of add function loaded");

			// connection with db via driver

			String dburl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";

			conn = DriverManager.getConnection(dburl);

			System.out.println("connection of add function has been established");

			System.out.println("==========================");

			// issue a query

			String query = "select * from user_info";

			stmt = conn.createStatement();

			rst = stmt.executeQuery(query);

			// process a query

			while(rst.next()) {
				int id = rst.getInt("userid");
				String username = rst.getString("username");
				String email = rst.getString("email");



				System.out.println("userid = "+id);
				System.out.println("username = "+username);
				System.out.println("useremail = "+email);
				System.out.println("********************************************");
			}


		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}



			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if(rst!=null) {
				try {
					rst.close(); // it is used to close any object
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}

	}

}
