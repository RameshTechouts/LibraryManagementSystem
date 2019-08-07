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
import com.library.entity.LoginEntity;
@WebServlet("/getLogin")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/css");
		PrintWriter pr = response.getWriter();
		
		String name = request.getParameter("uname");
		String password = request.getParameter("pwd");
		String username="";
		String pwds="";
		List<LoginEntity> list = LibraryDao.getLoginDetails(name,password);
		
		for(LoginEntity ob:list)
		{
			username = ob.getUname();
			pwds = ob.getPwd();
		}
		System.out.println("dao="+list);
		if(name.equals(username) && password.equals(pwds))
		{
			RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/jsp/welcome.jsp");
			rd.forward(request, response);
		}
		
			RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		
		
	}

}
