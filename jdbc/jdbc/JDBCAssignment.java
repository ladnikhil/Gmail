package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCAssignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Connection conn = null;

		PreparedStatement pstmt = null;

		ResultSet rs  = null;

		// to show all result set when we enter userid and password

		try {
			// load a driver

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver class loaded");

			// get connection of db from connections


			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";

			System.out.println("enter the username and password");// taking username password as input 
			String user = sc.nextLine();
			String password = sc.nextLine();



			conn = DriverManager.getConnection(dbUrl,user,password);// second method to create connections
			System.out.println("connection has been established");
			System.out.println("=============================");

			// issue a query

			String query = "select * from user_info where userid = ? and password = ?";

			pstmt = conn.prepareStatement(query);//

			// get input from query

			System.out.println("enter user id ");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));

			System.out.println("enter password ");
			pstmt.setString(2,sc.nextLine());


			rs = pstmt.executeQuery();// when we use static and dynamic querires bothh we use executeQUERY()

			// to execute above select query we need result set and query

			while(rs.next()) {
				int userid = rs.getInt("userid"); 
				String username = rs.getString("username"); 
				String email = rs.getString("email");

				System.out.println("************************");
				System.out.println("entered user is ");


				System.out.println("userid = "+userid);
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



			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if(rs!=null) {
				try {
					rs.close(); // it is used to close any object
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			sc.close();



		}


	}

}
