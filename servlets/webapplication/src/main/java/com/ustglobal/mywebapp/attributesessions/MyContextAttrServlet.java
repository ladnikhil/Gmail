package com.ustglobal.mywebapp.attributesessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/contextattribute")
public class MyContextAttrServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeInfoBean emp = new EmployeeInfoBean();

		

		emp.setEmpName("nikhil");
		emp.setEmpId(1);
		emp.setAge(21);
		emp.setSalary(25000);

		ServletContext context = getServletContext();
		context.setAttribute("emp1", emp);

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		out.println("<html>");
		out.println("<body>");

		out.println("<h3> context attribute has ben set</h3>");
		out.println("</body>");
		out.println("</html>");
	}
}
