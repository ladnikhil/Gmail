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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id1 = req.getParameter("id");
		int  id = Integer.parseInt(id1);
		
		String password = req.getParameter("password");
		
		 StudentInterface dao = new StudentInterfaceImplementation();
		 StudentBean bean = dao.login(id, password);
		 
		 String url = null;
		 if(bean != null) {
			  HttpSession session = req.getSession(true);
			  session.setAttribute("std",bean);
			  url = "./home.jsp";
		 }else {
			 url = "./login.jsp";
		 }
		 

			RequestDispatcher dispatcher = req.getRequestDispatcher(url);
			dispatcher.forward(req, resp);
		 
		 
		
	}
}
