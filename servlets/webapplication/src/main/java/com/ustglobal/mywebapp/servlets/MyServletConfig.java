package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletConfig extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// here we get the data of from init-param
		// here servlet config is dedicated to only one servlet
		ServletConfig config = getServletConfig();
		String nameVal = config.getInitParameter("name");

//		ServletContext context = getServletContext();
//		String val = context.getInitParameter("myParam");
//		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		out.println("<html>");
		out.println("<body>");
		out.println("<h3> name value in config is " + nameVal + "</h3>");
		//out.println("<h3>context param value is "+val+"</h3>");
		out.println("</body>");
		out.println("</html>");

	}// end of do get

}// end of class
