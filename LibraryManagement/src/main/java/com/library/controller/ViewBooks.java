package com.library.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.dao.LibraryDao;
import com.library.entity.SavebookEntity;

@WebServlet("/linkView")
public class ViewBooks extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h1><center>Books List</center></h1>");
		
		List<SavebookEntity> list=LibraryDao.getAllBooks();
		
		
		    request.setAttribute("listdata", list);
			RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/jsp/viewbooks.jsp");
			rd.forward(request, response);
		
		out.close();
	}
}
