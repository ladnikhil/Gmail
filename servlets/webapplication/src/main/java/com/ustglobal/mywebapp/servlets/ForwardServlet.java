package com.ustglobal.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forwardservlet")
public class ForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		// for forward we need request dispatcher object
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/myFirstServelet");// here we use this to were we want to forward
		dispatcher.forward(req, resp);
		
		
		
	}
}
