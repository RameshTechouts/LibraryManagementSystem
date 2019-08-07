package com.library.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.dao.LibraryDao;
import com.library.entity.RegistrationEntity;

@WebServlet("/Register")
public class RegistrationFormSave extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String pwd=request.getParameter("pwd");
		String usermail=request.getParameter("usermail");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		
		String dob=request.getParameter("dob");
		String gender=request.getParameter("gender");
		
		RegistrationEntity re =new RegistrationEntity();
		
		re.setFname(fname);
		re.setLname(lname);
		re.setPassword(pwd);
		re.setMail(usermail);
		re.setMobile(mobile);
		re.setDob(dob);
		re.setGender(gender);
		
		int status=LibraryDao.saveRegistration(re);
		if(status>0){
			out.print("<br><br>");
			out.print("<p><center>Record saved successfully!</center></p>");
			
		}else{
			out.println("Sorry! unable to save record");
		}
		
		out.close();
	}

}
