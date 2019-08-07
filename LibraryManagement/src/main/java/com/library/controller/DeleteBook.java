package com.library.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.dao.LibraryDao;
@WebServlet("/deletebook")
public class DeleteBook extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/css");
		PrintWriter pr = response.getWriter();
        
		
		String del_reader = request.getParameter("del_readerid");
		
		int status=LibraryDao.getDeleteBook(del_reader);
		
		if(status>0){
			pr.print("<br><br>");
			pr.print("<p><center>Record Delete successfully!</center></p>");
			}
		else{
			pr.println("Sorry! unable to save record");
		}
}

}
