package com.ustglobal.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myFirstServelet")      //name of file // it also starts with forward slash
public class MyFirstServlet extends HttpServlet{
	
	public  MyFirstServlet() {
		System.out.println("instantiation");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		Date date = new Date();
		
		//System.out.println("service");
		//System.out.println("changes");
		
		ServletContext context = getServletContext();
		String val = context.getInitParameter("myParam");
		
		resp.setContentType("text/html");// type of file we want to see
		resp.setHeader("refresh", "1");// here the tme gets incremented every 1 second automatically 
		PrintWriter out = resp.getWriter();// to print something on  browser
		
		// here we are sending html reponse
		
		out.println("<html>");
		
		// 2 nd method to get time incremented evey one second
//		out.println("<head>");
//		out.println("<meta http-equiv=\"refresh\" content=\"1\">");
//		out.println("</head>");
		
		out.println("<body>");
		out.println("<h2>Current System Data and time <br/>");
		out.print(date);
		out.println("</h2>");
		
		out.println("<h3>context param value is "+val+"</h3>");
		
		out.println("</body>");
		out.println("</html>");
		
		
		
	}// end of doGet()

}// end of class
