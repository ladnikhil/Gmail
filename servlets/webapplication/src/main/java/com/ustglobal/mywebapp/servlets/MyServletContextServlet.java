package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myContext")
public class MyServletContextServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// for servlet context that is it can be used in every servlet
		ServletContext context = getServletContext();
		String val = context.getInitParameter("myParam");
		
		
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		out.println("<html>");
		out.println("<body>");
		
		out.println("<h3>context param value is "+val+"</h3>");
		

		out.println("</body>");
		out.println("</html>");
		
		
	}// end of doget
}// end of class
