package com.library.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/linkAddbooks")
public class AddBooks extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/css");
		PrintWriter pr = response.getWriter();

		RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/jsp/addbooks.jsp");
		rd.forward(request, response);
}
}