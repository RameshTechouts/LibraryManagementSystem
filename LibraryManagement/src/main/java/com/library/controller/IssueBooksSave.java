package com.library.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.dao.LibraryDao;
import com.library.entity.IssueBookEntity;

import sun.util.calendar.BaseCalendar.Date;

@WebServlet("/issuebooks")
public class IssueBooksSave extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int uid=Integer.parseInt(request.getParameter("uid"));
		int bookid=Integer.parseInt(request.getParameter("book_id"));
		int r_uid=Integer.parseInt(request.getParameter("r_uid"));
		
		String issuedate=request.getParameter("issuedate");
		String enddate=request.getParameter("enddate");
		
		IssueBookEntity ib =new IssueBookEntity();
		
		ib.setUid(uid);
		ib.setBook_uid(bookid);
		ib.setReader_uid(r_uid);
		ib.setIssue_date(issuedate);
		ib.setEnd_date(enddate);
		
		
		int status=LibraryDao.saveIssueBook(ib);
		if(status>0){
			out.print("<br><br>");
			out.print("<p><center>Record saved successfully!</center></p>");
			
		}else{
			out.println("Sorry! unable to save record");
		}
		
		out.close();
	}

}