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
import com.library.entity.IssueBookEntity;

@WebServlet("/returnBooks")
public class ShowReturnBooks extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/css");
		PrintWriter pr = response.getWriter();
		String r_uid=request.getParameter("reader_uid");
		
		List<IssueBookEntity> list=LibraryDao.getReturnBookDetails(r_uid);
		System.out.println("list==#"+list);
		
	    request.setAttribute("returnlist", list);
		RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/jsp/returnbookview.jsp");
		rd.forward(request, response);
	
	    pr.close();
	}
}
