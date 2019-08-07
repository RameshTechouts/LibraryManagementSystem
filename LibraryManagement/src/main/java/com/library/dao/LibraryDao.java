package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.library.entity.DeleteBookEntity;
import com.library.entity.IssueBookEntity;
import com.library.entity.LoginEntity;
import com.library.entity.SavebookEntity;
import com.mysql.jdbc.PreparedStatement;




public class LibraryDao 
{
	public static Connection getConnection()
	{
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");  
	         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	
	public static List<LoginEntity>  getLoginDetails(String name,String password)
	{
		List<LoginEntity> li = new ArrayList<LoginEntity>();
		
		try {
			 Connection con = LibraryDao.getConnection();
			 PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from lib_staff where name = '"+ name +"' and role = '"+ password +"' ");
			 ResultSet rs = ps.executeQuery();
		  
		     while(rs.next())
		     {
		    	 LoginEntity bean = new LoginEntity();
		    	 
		    	 bean.setUname(rs.getString(2));
		    	 bean.setPwd(rs.getString(3));
		    	 
		    	 li.add(bean);
		     }
		}
		catch (Exception e) {
			
		}
		return li;
		
	}

	public static int save(SavebookEntity s) {
		
		int status=0;
		try{
			Connection con=LibraryDao.getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into lib_books(b_uid,b_name,b_auther) values (?,?,?)");
			ps.setInt(1,s.getBook_id());
			ps.setString(2,s.getName());
			ps.setString(3,s.getAuther());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}

	public static List<SavebookEntity> getAllBooks() {
		List<SavebookEntity> list=new ArrayList<SavebookEntity>();
		
		try{
			Connection con=LibraryDao.getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from lib_books");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				SavebookEntity e=new SavebookEntity();
				
				e.setBook_id(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setAuther(rs.getString(3));
				
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}

	public static int saveIssueBook(IssueBookEntity ib) {
		
		int status=0;
		try{
			Connection con=LibraryDao.getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into lib_transactions(uid,b_uid,r_uid,issue_date,end_date) values (?,?,?,?,?)");
			ps.setInt(1,ib.getUid());
			ps.setInt(2,ib.getBook_uid());
			ps.setInt(3, ib.getReader_uid());
			ps.setString(4,ib.getIssue_date());
			ps.setString(5,ib.getEnd_date());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}

	public static List<IssueBookEntity> getAllIssueBooks() {
		List<IssueBookEntity> list2=new ArrayList<IssueBookEntity>();
		
		try{
			Connection con=LibraryDao.getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from lib_transactions");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				IssueBookEntity is=new IssueBookEntity();
				
				is.setUid(rs.getInt(1));
				is.setBook_uid(rs.getInt(2));
				is.setReader_uid(rs.getInt(3));
				is.setIssue_date(rs.getString(4));
				is.setEnd_date(rs.getString(5));
				
				
				list2.add(is);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list2;
	}

	public static List<IssueBookEntity> getReturnBookDetails(String r_uid) {
		List<IssueBookEntity> list=new ArrayList<IssueBookEntity>();
		
		try{
			Connection con=LibraryDao.getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("select b.uid,b.name,b.role,a.b_uid,a.issue_date,a.end_date from lib_transactions a,lib_readers b where b.uid='"+ r_uid +"' ");
			ResultSet rs=ps.executeQuery();
			
			IssueBookEntity is=new IssueBookEntity();
			while(rs.next())
			{
				is.setUid(rs.getInt(1));
				is.setName(rs.getString(2));
				is.setRole(rs.getString(3));
				is.setBook_uid(rs.getInt(4));
				is.setIssue_date(rs.getString(5));
				is.setEnd_date(rs.getString(6));
				
				
			}
			list.add(is);
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}

	public static int getDeleteBook(String del_reader)
	{
		int list=0;
		try {
			Connection con=LibraryDao.getConnection();
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("delete from lib_transactions where  r_uid = '"+ del_reader +"' ");
			
			list=ps.executeUpdate();
			con.close();
		}
		catch (Exception e) {
			
		}


		return list;
	}


}
