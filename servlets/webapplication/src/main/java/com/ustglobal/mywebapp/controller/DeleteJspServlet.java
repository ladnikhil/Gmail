package com.ustglobal.mywebapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.dao.EmployeeDao;
import com.ustglobal.dao.EmployeedaoJpaImp;

@WebServlet("/deletejspservlet")
public class DeleteJspServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		
		if(session != null) {
		
		String id = req.getParameter("id");
		
		EmployeeDao dao = new EmployeedaoJpaImp();
		dao.deletejspemployee(Integer.parseInt(id));
		}else {
			resp.sendRedirect("./loginjsp");
		}
		
		
	}
}
