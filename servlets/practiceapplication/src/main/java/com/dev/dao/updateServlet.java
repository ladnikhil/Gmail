package com.dev.dao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.bean.StudentBean;

@WebServlet("/update")
public class updateServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		RequestDispatcher dispatcher = req.getRequestDispatcher("/update.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			
			String id1 = req.getParameter("id");
			int id = Integer.parseInt(id1);
			
			String password = req.getParameter("password");
			
			String name = req.getParameter("name");
			
			String age1 = req.getParameter("age");
			int age = Integer.parseInt(age1);
			

			StudentBean bean = new StudentBean();
			bean.setId(id);
			bean.setName(name);
			bean.setAge(age);
			bean.setPassword(password);
			StudentInterface dao = new StudentInterfaceImplementation();
			
			dao.updateStudent(id, name, age, password);
			
		}
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		
		
		
	}
}
