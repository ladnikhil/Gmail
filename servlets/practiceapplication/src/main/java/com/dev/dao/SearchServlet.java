package com.dev.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.bean.StudentBean;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/search.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		
		if(session !=  null) {
		
		
		
		StudentInterface stu = new StudentInterfaceImplementation();
		
		String idval = req.getParameter("id");
		int id = Integer.parseInt(idval);
		
		StudentBean sim = stu.searchstudent(id);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		if(sim != null) {
			out.println("<h3>student data for employeeid "+id+ "</h3>");
			out.println("employeeid "+id);
			out.println("</br> studentaname "+sim.getName());
			out.println("</br>studenteeage  "+sim.getAge());
			
			}else {
				out.println("<h3> student id not found "+id+"</h3>");
			}
		
		out.println("</html>");
		out.println("</body>");
		}else {
			resp.sendRedirect("./login.jsp");
		}
		
		
		
	}
}
