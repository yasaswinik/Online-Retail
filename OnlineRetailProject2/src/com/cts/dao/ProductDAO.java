package com.cts.dao;

import java.util.List;

import com.cts.model.Product;

public interface ProductDAO {

	public boolean addProduct(Product p);
	public Product displayProduct(int book_id);
	
}
