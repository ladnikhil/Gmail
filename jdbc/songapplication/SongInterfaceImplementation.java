package com.ustglobal.songapplication;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class SongInterfaceImplementation implements SongInterface {

	static Scanner sc = new Scanner(System.in);

	@Override
	public void playSongs() {

		Connection conn = null;

		Statement stmt = null;

		ResultSet rs = null;

		try {
			// load a driver

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver of playsongs have been loaded");

			// establish a database connection

			String dbUrl = "jdbc:mysql://localhost:3306/MusicPlayer";
			String filepath = "C:\\Users\\acer\\Desktop\\db.properties";

			FileReader file = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(file);

			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection of delete method has been established");
			System.out.println("=============================");

			// issue a query

			String query = "select * from  MusicFiles";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			// RESULT OF QUERY

			while (rs.next()) {

				int songid = rs.getInt("Song_ID");
				String songtitle = rs.getString("Song_Title");
				String artistname = rs.getString("Artist_Name");
				String albumname = rs.getString("Album_Name");
				String songlocation = rs.getString("Song_Location");
				String description = rs.getString("Description");

				System.out.println("name of the song that is playing = " + songtitle);
				System.out.println("songid = " + songid);

				System.out.println("artistname = " + artistname);
				System.out.println("albumname = " + albumname);
				System.out.println("songlocation = " + songlocation);
				System.out.println("description = " + description);

				System.out.println("********************************************");

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public void searchsong() {

		Connection conn = null;

		PreparedStatement pstmt = null;

		ResultSet rs = null;

		// load driver

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver of searchsong has been loaded");

			// get db connections

			String dbUrl = "jdbc:mysql://localhost:3306/MusicPlayer";
			String filepath = "C:\\Users\\acer\\Desktop\\db.properties";

			FileReader file = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(file);

			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection of delete method has been established");
			System.out.println("=============================");

			// issue a query

			String query = "select * from MusicFiles where Song_Title= ? ";

			pstmt = conn.prepareStatement(query);//

			// get input from query

			System.out.println("search for song ");
			pstmt.setString(1, sc.nextLine());

			rs = pstmt.executeQuery();

			while (rs.next()) {

				String songname = rs.getString("Song_Title");

				System.out.println(songname + " is present and its playing");

				System.out.println("********************************************");

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void showallSongs() {

		Connection conn = null;

		Statement stmt = null;

		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/MusicPlayer";
			String filepath = "C:\\Users\\acer\\Desktop\\db.properties";

			FileReader file = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(file);

			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection of showallSongs method has been established");
			System.out.println("=============================");

			// issue a query

			String query = "select Song_Title from  MusicFiles";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			// result of query

			while (rs.next()) {

				String songtitle = rs.getString("Song_Title");

				System.out.println("songname is  " + songtitle + " is playing");

				System.out.println("********************************************");

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void Operations() {

		Connection conn = null;

		PreparedStatement pstmt = null;

		// load a driver

		try {
			Class.forName("com.mysql.jdbc.Driver");

			// establish db connecyions

			String dbUrl = "jdbc:mysql://localhost:3306/MusicPlayer";
			String filepath = "C:\\Users\\acer\\Desktop\\db.properties";

			FileReader file = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(file);

			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection of operation method has been established");
			System.out.println("=============================");

			String query = "insert into MusicFiles values(?,?,?,?,?,?)";

			pstmt = conn.prepareStatement(query);

			System.out.println("enter the songid");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));

			System.out.println("enter the song title");
			pstmt.setString(2, sc.nextLine());

			System.out.println("enter the artistname");
			pstmt.setString(3, sc.nextLine());

			System.out.println("enter the albumname");
			pstmt.setString(4, sc.nextLine());

			System.out.println("enter the songlocation");
			pstmt.setString(5, sc.nextLine());

			System.out.println("enter the description");
			pstmt.setString(6, sc.nextLine());

			int count = pstmt.executeUpdate();
			// process the results of query

			if (count > 0) {
				System.out.println("query ok, " + count + " row affected");
			} else {
				System.out.println("something wrong");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	public void edit() {

		Scanner sc = new Scanner(System.in);

		Connection conn = null;

		PreparedStatement pstmt = null;

		try {
			// load a driver class
			Class.forName("com.mysql.jdbc.Driver");

			// connect db connections

			String dbUrl = "jdbc:mysql://localhost:3306/MusicPlayer";
			String filepath = "C:\\Users\\acer\\Desktop\\db.properties";

			FileReader file = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(file);

			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection of operation method has been established");
			System.out.println("=============================");

			// issue a query

			String query = "update MusicFiles set  Song_Title = ? where  Song_ID = ? ";

			pstmt = conn.prepareStatement(query);

			// for giving input to query through prepared statement

			System.out.println("enter new song that u want to add in database");
			pstmt.setString(1, sc.nextLine());

			System.out.println("enter userid where u want to add");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));

			int count = pstmt.executeUpdate();

			// to run a query

			if (count > 0) {
				System.out.println("query is ok" + count + " rows have been affected");
			} else {
				System.out.println("something is wrong");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void delete() {

		Scanner sc = new Scanner(System.in);

		Connection conn = null;

		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			// connec connections

			String dbUrl = "jdbc:mysql://localhost:3306/MusicPlayer";
			String filepath = "C:\\Users\\acer\\Desktop\\db.properties";

			FileReader file = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(file);

			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection of operation method has been established");
			System.out.println("=============================");

			// issue a query

			String query = "delete from MusicFiles where Song_ID = ? and Song_Title = ?";

			pstmt = conn.prepareStatement(query);

			// to give input to query

			System.out.println("enter songid to be deleted ");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));

			System.out.println("enter songname to be deleted ");
			pstmt.setString(2, sc.nextLine());

			int count = pstmt.executeUpdate();

			// to view results of query

			if (count > 0) {
				System.out.println("query is ok" + count + " rows have been affected");
			} else {
				System.out.println("something is wrong");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void playSpecificSong() {

		Scanner sc = new Scanner(System.in);

		Connection conn = null;

		PreparedStatement pstmt = null;

		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("driver class loaded");

			// get connection of db from connections

			String dbUrl = "jdbc:mysql://localhost:3306/MusicPlayer";
			String filepath = "C:\\Users\\acer\\Desktop\\db.properties";

			FileReader file = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(file);

			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection of operation method has been established");
			System.out.println("=============================");

			// issue a query

			String query = "select * from MusicFiles where  Song_Title = ?";

			pstmt = conn.prepareStatement(query);//

			// get input from query

			System.out.println("enter any song name u want to listen ");
			pstmt.setString(1, sc.nextLine());

			rs = pstmt.executeQuery();// when we use static and dynamic querires bothh we use executeQUERY()

			// to execute above select query we need result set and query

			while (rs.next()) {

				String songname = rs.getString("Song_Title");

				System.out.println(songname + " is playing");

				System.out.println("********************************************");

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void PlayAllRandomSong() {

		Scanner sc = new Scanner(System.in);

		Connection conn = null;

		PreparedStatement pstmt = null;

		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("driver class loaded");

			// get connection of db from connections

			String dbUrl = "jdbc:mysql://localhost:3306/MusicPlayer";
			String filepath = "C:\\Users\\acer\\Desktop\\db.properties";

			FileReader file = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(file);

			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection of operation method has been established");
			System.out.println("=============================");

			// issue a query

			String query = "select * from MusicFiles order by rand() limit 1";

			pstmt = conn.prepareStatement(query);//

			// get input from query

			// System.out.println("enter song name u want to listen ");
			// pstmt.setString(1,sc.nextLine());

			rs = pstmt.executeQuery();// when we use static and dynamic querires bothh we use executeQUERY()

			// to execute above select query we need result set and query

			while (rs.next()) {

				String songname = rs.getString("Song_Title");
				System.out.println("random song" + songname + " is playing");
				System.out.println("********************************************");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
