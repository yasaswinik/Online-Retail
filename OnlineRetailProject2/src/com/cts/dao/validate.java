package com.cts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cts.servlet.DBUtil;

public class validate {
	public static boolean checkUser(String email,String pass) 
    {
     boolean st =false;
     try{
	 //creating connection with the database 
        Connection con= DBUtil.getConnection();
        String sql="select * from Customer where email=? and pass=?";
        PreparedStatement ps =con.prepareStatement(sql);
        ps.setString(1, email);
        ps.setString(2, pass);
        ResultSet rs =ps.executeQuery();
        st = rs.next();
     }catch(Exception e)
     {
         e.printStackTrace();
     }
        return st;                 
 }   
	
}
