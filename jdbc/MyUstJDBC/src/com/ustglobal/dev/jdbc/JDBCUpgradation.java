package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpgradation {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		Connection conn = null;
		
		PreparedStatement pstmt = null;

		try {
			// load the driver
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


			// issue a query via connection
			
			String query = "update user_info set email = ? where userid = ? and password = ?";
			
			pstmt = conn.prepareStatement(query);
			
			// for giving input to query through prepared statement
			
			System.out.println("enter new emailid");
			pstmt.setString(1, sc.nextLine());
			
			System.out.println("enter userid");
			pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
			
			System.out.println("enter the password");
			pstmt.setString(3, sc.nextLine());
			
			int count  = pstmt.executeUpdate();
			
			// to run a query
			
			if(count > 0) {
				System.out.println("query is ok"+count+" rows have been affected");
			}else {
				System.out.println("something is wrong");
			}
			
			





		} catch (Exception e) {
			System.out.println("something is wrong");
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
			
			sc.close();
		}
	}

}
