package com.ustglobal.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDeletuin {

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
			String filepath = "C:\\Users\\acer\\Desktop\\db.properties";// we created file with .properties extension

			FileReader reader = new FileReader(filepath);// to read a file

			Properties prop = new Properties();// to get properties
			prop.load(reader);// to load that file




			conn = DriverManager.getConnection(dbUrl,prop);// third  method to create connections using properties file
			System.out.println("connection has been established");
			System.out.println("=============================");


			// issue a query via connection

			String query = "delete from user_info where userid = ? and password = ?";

			pstmt = conn.prepareStatement(query);

			// to give input to query

			System.out.println("enter user id to be deleted ");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));

			System.out.println("enter password to be deleted ");
			pstmt.setString(2,sc.nextLine());

			int count = pstmt.executeUpdate();

			// to view results of query

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
