package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.model.Product;

public class ProductDAOImpl implements ProductDAO {

	Connection con;
	PreparedStatement s;

	public ProductDAOImpl() 
		// TODO Auto-generated constructor stub
	{
		super();
		con=DBUtil.getConnection();
		s=null;
	}
	@Override
	public Product displayProduct(int book_id) {
		// TODO Auto-generated method stub
		Product p=null;
		try {
			s=con.prepareStatement("select * from product where book_id=?");
			s.setString(1, "book_id");
			ResultSet rs=s.executeQuery();
			rs.next();
			
			p=new Product();
			p.setBook_id(rs.getString("book_id"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return p;
	}
	@Override
	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		       int result=0;
				try {
					s=con.prepareStatement("insert into Product values(?,?,?,?,?,?)");
					s.setString(1, p.getBook_id());
					s.setString(2, p.getBook_Name());
					s.setString(3, p.getBook_Type());
					s.setString(4, p.getPublisher_Name());
					s.setString(5, p.getLanguge());
					s.setDouble(6, p.getPrice());
				    result=s.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				if(result==0)
		        return false;
				else
					return true;
			
	}
	

}
