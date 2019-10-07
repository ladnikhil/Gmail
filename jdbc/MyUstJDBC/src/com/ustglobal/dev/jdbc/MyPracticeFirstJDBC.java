package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyPracticeFirstJDBC {

	public static void main(String[] args) {

		Connection conn = null;
		
		Statement st = null;
		
		ResultSet rs = null;

		try {
			
			// LOADING A DRIVER
			
			java.sql.Driver dri = new Driver();   // always use mysql.jdbc.driver
			DriverManager.registerDriver(dri);
			System.out.println("driver is loaded");
			
			// connecting sql database via connections
			
			
			//String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			String url = "jdbc:mysql://localhost:3306/ustglobal?user=root&password=root";
			
			conn = DriverManager.getConnection(url);
			System.out.println("connections has been established");
			System.out.println("**********************");
			
			
			// issue  a query via connections
			
			//String query = "select * from user_info";
			String query = "select * from department_info ";
			
			st = conn.createStatement();
			
			rs =st.executeQuery(query);
			
			// show result of query
			
			while(rs.next()) {
//				int id = rs.getInt("userid");
//				System.out.println("userid is = "+id);
//				
//				String username = rs.getString("username");
//				System.out.println("username is = "+username);
//				
//
//				String email = rs.getString("email");
//				System.out.println("email is = "+email);
				
				int deptid = rs.getInt("deptid");
				System.out.println("deptid is = "+deptid);
				
				String departmentname = rs.getString("departmentname");
				System.out.println("departmentname is = "+departmentname);
				

				String  location = rs.getString("location");
				System.out.println("email is = "+ location);
				

				System.out.println("*****************************");
				
				
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}    finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			
			
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}

	}

}
