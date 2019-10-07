package com.ustglobal.dev.datamanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class UserInfoImplementation implements UserInfo{

	public UserInfoImplementation() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	 // for connections
	
	public static final String DBURL="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		

	}

	@Override
	public User getAllInfo() {
		
		String query = "SELECT * FROM user_info";
		User u = new User();
		try(Connection conn=DriverManager.getConnection(DBURL);
				Statement stmt = (Statement) conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)){
			while(rs.next()) {
				u.setUserid(rs.getInt("userid"));
				u.setUsername(rs.getString("username"));
				u.setEmail(rs.getString("email"));
				System.out.println(u);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public void createProfile(User user) {
		String query = "Insert into user_info"
				+ " values(?,?,?,?)";
		try(Connection conn = DriverManager.getConnection(DBURL);
				PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(query)){
				pstmt.setInt(1, user.getUserid());
				pstmt.setString(2, user.getUsername());
				pstmt.setString(3, user.getEmail());
				pstmt.setString(4, user.getPasswd());
			int i = pstmt.executeUpdate();
			
			if(i>0) {
				System.out.println("Profile Created....");
			}else {
				System.out.println("Failed to Create Profile....");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	}


