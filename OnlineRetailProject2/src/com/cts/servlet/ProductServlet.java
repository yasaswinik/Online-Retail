package com.cts.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dao.DBUtil;
import com.cts.model.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	Connection con=null;
    PreparedStatement s=null;
    @Override
    public void init(ServletConfig config) throws ServletException 
    {    	
    	super.init(config);
    	con=DBUtil.getConnection();
    }
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String book_id=request.getParameter("book_id");
	     String book_name=request.getParameter("book_name");
	     String book_type=request.getParameter("book_type");
	     String publisher_name=request.getParameter("publisher_name");
	     String language=request.getParameter("language");
	     String price=request.getParameter("price");
	     //Customer c=new Customer(fname, mobno, address, gender, email, pass);
	         
	     PrintWriter out=response.getWriter();
	     out.println("book_id"+book_id);
	     out.println("book_name"+book_name);
	     out.println("book_type"+book_type);
	     out.println("publisher_name"+publisher_name);
	     out.println("language"+language);
	     out.println("price"+price);
	     
	     
	     /*
	      * FNAME  VARCHAR2(25),
	MOBNO NUMBER,
	ADDRESS VARCHAR2(60),
	GENDER VARCHAR2(6),
	EMAIL VARCHAR2(50),
	PASS VARCHAR2(8
	      */
	     
	     
	     if(con!=null)
	     {
//	     
//	     
	      try 
	      {
	 		s=con.prepareStatement("insert into Product values(?,?,?,?,?,?)");
	 		s.setString(1, book_id);
	 		s.setString(2, book_name);
	 		s.setString(3, book_type);
	 		s.setString(4, publisher_name);
	 		s.setString(5, language);
	 		s.setString(6, price);
	 	
	 		int res=s.executeUpdate();
	 		String r=null;
	 		
	 		if(res==0)
	 		{
	 			r="insertion unsuccessfull!!!!!!";
	  		}
	 		else
	 		{
	 			r="record added successfully!!!!";
	 		}
	 		PrintWriter pw=response.getWriter();
	 		pw.write(r);
	 		
	 		
	 		
	 	} catch (SQLException e) {
	 		// TODO Auto-generated catch block
	 		e.printStackTrace();
	 	}
	     
	     
	     }else
	     {
	    	 
	    	 
	    	 out.println("conn. is not ther ");
	    	 
	     }
	     
	     
	     
	    } 
	    
	    
	    @Override
		public void destroy()
	    {
//			try {
//				con.close();
//				st.close();
//			} catch (SQLException e) 
//			{
//				e.printStackTrace();
//			}
			
	    }
	    
	    

}
