package com.ustglobal.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.dao.EmployeeDao;
import com.ustglobal.dao.EmployeedaoJpaImp;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/loginjsp")
public class LoginjspServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		// here first browser makes rewuest to server then to login.jsp here and passes it to browser again and then it goes to do post
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// here we will get 
		
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		int idvalue = Integer.parseInt(id);
		
		EmployeeDao dao = new EmployeedaoJpaImp();
		EmployeeInfoBean bean = dao.login(idvalue, password);
		
		String url = null;
		
		
		if(bean != null) {
			
			// creating a session
			
			HttpSession session = req.getSession(true);
			session.setAttribute("bean", bean);
			url = "./home.jsp";
			
		}else {
			url = "./login.jsp";
		}
		
		
		// hibernate request to validate user
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
		
	}
}
