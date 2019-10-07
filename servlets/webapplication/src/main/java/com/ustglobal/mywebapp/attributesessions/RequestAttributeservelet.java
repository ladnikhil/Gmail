package com.ustglobal.mywebapp.attributesessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/requestAttribute")
public class RequestAttributeservelet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// to use the objects created in forwarsrequest servlet
		EmployeeInfoBean emp = (EmployeeInfoBean) req.getAttribute("employee");//// method to get share objects from one servlet to other

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		out.println("<html>");
		out.println("<body>");
		out.println("<h3> employeename is "+emp.getEmpId()+"</h3>");
		out.println("<h3> employeename is "+emp.getEmpName()+"</h3>");
		out.println("<h3> employeename is "+emp.getAge()+"</h3>");
		out.println("</body>");
		out.println("</html>");
		

	}

}
