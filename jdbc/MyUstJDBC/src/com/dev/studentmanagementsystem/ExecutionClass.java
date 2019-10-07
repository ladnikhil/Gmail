package com.dev.studentmanagementsystem;

import java.util.Scanner;

public class ExecutionClass {

	public static void main(String[] args) {
		
		StudentImplementation st = new StudentImplementation();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("to view data of student management system press 1");
		System.out.println("to add data to student management system press 2");
		System.out.println("to updata data of student management system press 3");
		System.out.println("to delete data ofrom student management system press 4");
		
		
		System.out.println("===welcome to student management system========");
		System.out.println("enter ur choise");
		int i = sc.nextInt();
		
		
		if(i==1) {
			st.show();
		}else if(i==2) {
			st.add();
		}else if(i==3) {
			st.update();
		}else {
			st.delete();
		}
	}
}
