package com.ustglobal.mywebapp.sessions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.dao.EmployeeDao;
import com.ustglobal.dao.EmployeedaoJpaImp;
import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	EmployeeDao dao = new EmployeedaoJpaImp();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//get the form data
		
		String empidval = req.getParameter("empId");
		String password = req.getParameter("password");
		int empId = Integer.parseInt(empidval);
		
		EmployeeInfoBean employeeInfoBean = dao.login(empId, password);
		
		
		if(employeeInfoBean != null) {
			HttpSession session = req.getSession(true);// creation of session till objet is active
			session.setAttribute("employeeinfo", employeeInfoBean);
			
			resp.sendRedirect("./homepage.html");
		}else {
			resp.sendRedirect("./loginform.html");
		}
		
		
	}
}
