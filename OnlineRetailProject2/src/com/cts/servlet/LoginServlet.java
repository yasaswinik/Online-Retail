package com.cts.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dao.validate;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		Connection con=DBUtil.getConnection();
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		if(validate.checkUser(email, pass))
			{
			RequestDispatcher rd= request.getRequestDispatcher("Homepage.html");
		    rd.forward(request, response);
			}
		else
		{
			System.out.println("Invalid credentials");
			RequestDispatcher rd= request.getRequestDispatcher("Login.html");
	        rd.forward(request, response);
	}
	}

}
