package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/includeservlet")
public class IncludeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		
		
		// this is data from include servlet
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3> this is a include servlet </h3>");
		out.println("<h3> line 2</h3>");
		out.println("</body>");
		out.println("</html>");
		
		// this data from second servlet
		/*
		 * RequestDispatcher dispatcher =
		 * req.getRequestDispatcher("/myFirstServelet");// here we use this to were we
		 * want to include dispatcher.include(req, resp);
		 */// herer we have use this to display all daata from both servlets
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/welcome.html");// here we use this to were we want to include
		dispatcher.include(req, resp);
		
		
		
	}
}
