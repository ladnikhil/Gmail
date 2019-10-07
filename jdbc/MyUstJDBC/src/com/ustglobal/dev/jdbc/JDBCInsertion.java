
package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Connection conn = null;

		PreparedStatement pstmt = null;

		// load the driver by using 2ND METHOD I.E class.forname

		try {
			Class.forName("com.mysql.jdbc.Driver");// when we use class.forname we do not need to register a driver
			System.out.println("driver loaded");

			// get db connections via driver

			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";

			System.out.println("enter the username and password");// taking username password as input
			String user = sc.nextLine();
			String password = sc.nextLine();

			conn = DriverManager.getConnection(dbUrl, user, password);// second method to create connections
			System.out.println("connection has been established");
			System.out.println("=============================");

			// issue a sql query using connections

			String query = "insert into user_info values(?,?,?,?)";// dynamic query

			pstmt = conn.prepareStatement(query); // using prepared statement we mostly use this in dynamic queries

			// for giving input to query through prepared statement

			System.out.println("enter the username");
			pstmt.setString(1, sc.nextLine());

			System.out.println("enter the userid");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine())); // here integer.parse converts string to integer and 2 is
																// column nno of databse

			System.out.println("enter the email");
			pstmt.setString(3, sc.nextLine());

			System.out.println("enter the password");
			pstmt.setString(4, sc.nextLine());

			int count = pstmt.executeUpdate(); // return type is integer

			// process the results of query

			if (count > 0) {
				System.out.println("query ok, " + count + " row affected");
			} else {
				System.out.println("something wrong");
			}

		} catch (Exception e) {
			System.out.println("something wrong");
			e.printStackTrace();
		} finally {

			// closing all jdbc objects

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			sc.close(); // close scanner object

		}

	}

}
