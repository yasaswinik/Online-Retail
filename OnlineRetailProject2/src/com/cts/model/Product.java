package com.cts.model;

public class Product {

	private String book_id;
	private String book_Name;
	private String book_Type;
	private String publisher_Name;
	private String languge;
	private double price;
	
	
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getBook_Name() {
		return book_Name;
	}
	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}
	public String getBook_Type() {
		return book_Type;
	}
	public void setBook_Type(String book_Type) {
		this.book_Type = book_Type;
	}
	public String getPublisher_Name() {
		return publisher_Name;
	}
	public void setPublisher_Name(String publisher_Name) {
		this.publisher_Name = publisher_Name;
	}
	public String getLanguge() {
		return languge;
	}
	public void setLanguge(String languge) {
		this.languge = languge;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String book_id,String book_Name, String book_Type, String publisher_Name, String languge, double price) {
		super();
		this.book_id=book_id;
		this.book_Name = book_Name;
		this.book_Type = book_Type;
		this.publisher_Name = publisher_Name;
		this.languge = languge;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
