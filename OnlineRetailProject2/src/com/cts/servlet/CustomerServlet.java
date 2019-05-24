package com.cts.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.model.Customer;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con=null;
    PreparedStatement st=null;
    @Override
    public void init(ServletConfig config) throws ServletException 
    {    	
    	super.init(config);
    	con=DBUtil.getConnection();
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
    	
    	
     String fname=req.getParameter("fname");
     String mobno=req.getParameter("mobno");
     String address=req.getParameter("address");
     String gender=req.getParameter("gender");
     String email=req.getParameter("email");
     String pass=req.getParameter("pass");
     //Customer c=new Customer(fname, mobno, address, gender, email, pass);
         
     PrintWriter out=resp.getWriter();
     out.println("fname"+fname);
     out.println("mobile"+mobno);
     out.println("address"+address);
     out.println("gender"+gender);
     out.println("email"+email);
     out.println("pass"+pass);
     
     
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
 		st=con.prepareStatement("insert into Customer(fname, mobno, address, gender, email, pass) values(?,?,?,?,?,?)");
 		st.setString(1, fname);
 		st.setString(2, mobno);
 		st.setString(3, address);
 		st.setString(4, gender);
 		st.setString(5, email);
 		st.setString(6, pass);
 	
 		int res=st.executeUpdate();
 		String r=null;
 		
 		if(res==0)
 		{
 			r="insertion unsuccessfull!!!!!!";
  		}
 		else
 		{
 			r="record added successfully!!!!";
 		}
 		PrintWriter pw=resp.getWriter();
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
//		try {
//			con.close();
//			st.close();
//		} catch (SQLException e) 
//		{
//			e.printStackTrace();
//		}
		
    }
    
    
    
}
