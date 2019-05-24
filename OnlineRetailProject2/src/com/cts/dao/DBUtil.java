package com.cts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection con;
	
	public static Connection getConnection() 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
