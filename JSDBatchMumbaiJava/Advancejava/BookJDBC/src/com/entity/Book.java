package com.entity;

public class Book {
	private int bookid;
	private String bookname;
	private String bookauthor;
	private int bookpublish;
	public Book(int bookid, String bookname, String bookauthor, int bookpublish) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookpublish = bookpublish;
	}
	
	
	public int getBookid() {
		return bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public int getBookpublish() {
		return bookpublish;
	}
	
	
	
}
