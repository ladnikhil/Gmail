 package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {

		Connection conn = null; // always use connection.java.sql // they are interfaces

		Statement stmt = null; // always use statement.java.sql // they are interfaces

		ResultSet rs = null; // always use resultset.java.sql // they are interfaces

		try {

			// LOAD THE DRIVER

			java.sql.Driver div = new Driver(); // always use mysql.jdbc.driver
			DriverManager.registerDriver(div); // always we need to register when we load the class (and here div is
												// object)
			System.out.println("driver loaded");

			// get connection via driver

			// here ust_ty_db is name of database in mysql
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";// url for connection

			conn = DriverManager.getConnection(dbUrl); // get connection helps us to get connection
			System.out.println("connection established");
			System.out.println("=============================================");

			// ISSUE SQL QUERY VIA CONNECTION

			String query = "select * from user_info";// here user_info is table in database name ust_ty_db

			// to create this string into query we need a statement so we use
			// createstatement()

			stmt = conn.createStatement();

			// here query does not have semiclon so we need another method to execute query

			rs = stmt.executeQuery(query); // here give arguement as query variable and rs is result set

			while (rs.next()) { // return type of next is boolean

				// next() --- if any rows are present of given query it will print true else it
				// will print false
				int userid = rs.getInt("userid");
				String username = rs.getString("username"); // here we have arguement as column name i.e username
				String email = rs.getString("email");// here we have arguement as column name i.e email

				System.out.println("userid = " + userid);
				System.out.println("username = " + username);
				System.out.println("useremail = " + email);
				System.out.println("********************************************");

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			// CLOSE ALL THE jdbc OBJECTS

			if (conn != null) {
				try {
					conn.close(); // it is used to close objects
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close(); // it is used to close any object

				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (rs != null) {
				try {
					rs.close(); // it is used to close any object
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

	}

}
