package com.ustglobal.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.dao.EmployeeDao;
import com.ustglobal.dao.EmployeedaoJpaImp;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/registerservlet")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher dispatcher = req.getRequestDispatcher("/register.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");

		String name = req.getParameter("name");

		String age = req.getParameter("age");

		String salary = req.getParameter("salary");

		String designation = req.getParameter("designation");

		String password = req.getParameter("password");
		
		
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setEmpId(Integer.parseInt(id));
		bean.setEmpName(name);
		bean.setAge(Integer.parseInt(age));
		bean.setSalary(Double.parseDouble(salary));
		bean.setDesignation(designation);
		bean.setPassword(password);
	
		EmployeeDao dao = new EmployeedaoJpaImp();
		dao.addjspemployee(bean);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
		
		
		
	}

}
