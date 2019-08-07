package com.library.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.dao.LibraryDao;
import com.library.entity.SavebookEntity;


@WebServlet("/SaveBooks")
public class SaveBooks extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String bookid=request.getParameter("book_id");
		int bid=Integer.parseInt(bookid);  
		String name=request.getParameter("name");
		String auther=request.getParameter("auther");
		
		SavebookEntity s =new SavebookEntity();
		
		s.setBook_id(bid);
		s.setName(name);
		s.setAuther(auther);
		
		int status=LibraryDao.save(s);
		if(status>0){
			out.print("<br><br>");
			out.print("<p><center>Record saved successfully!</center></p>");
			
		}else{
			out.println("Sorry! unable to save record");
		}
		
		out.close();
	}

}
