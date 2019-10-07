package com.ustglobal.mywebapp.attributesessions;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/forwardrequest")
public class ForwardRequestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeInfoBean emp = new EmployeeInfoBean();
		
		req.setAttribute("employee", emp);// method to share objects from one servlet to other
		
		emp.setEmpName("nikhil");
		emp.setEmpId(1);
		emp.setAge(21);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/requestAttribute");// here we use this to were we want to forward
		dispatcher.forward(req, resp);
		
		
		}
}
