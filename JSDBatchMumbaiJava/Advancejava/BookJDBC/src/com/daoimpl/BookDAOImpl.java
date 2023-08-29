package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.config.Helpher;
import com.dao.BookDAO;
import com.entity.Book;

import java.util.Scanner;

public class BookDAOImpl implements BookDAO{
	Scanner sc = new Scanner(System.in);
	@Override
	public boolean addBook(Book b) {
		boolean result = false;
		try {
			Connection connection = Helpher.createConnection();
			String s = "insert into Book(bookid,bookname,bookauthor,bookpublish) values (?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(s);
		stmt.setInt(1,b.getBookid());
		stmt.setString(2, b.getBookname());
		stmt.setString(3, b.getBookauthor());
		stmt.setInt(4, b.getBookpublish());
		stmt.execute();
		result = true;
		
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public boolean updateBook() {
		boolean result = false;
		try {
			Connection connection = Helpher.createConnection();
			System.out.println("Enter id");
			 int bookid = sc.nextInt();
			 System.out.println("Enter change year");
			 int bookyear = sc.nextInt();
			String s2= "Update Book set bookpublish='"+bookyear+"' "+" where bookid='"+bookid+"' ";
			PreparedStatement stmt = connection.prepareStatement(s2);
			stmt.executeUpdate();
			
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public boolean deleteBook() {
		boolean result = false;
		try {
			Connection connection = Helpher.createConnection();
			System.out.println("Enter id");
			int bookid = sc.nextInt();
			String s3 = "delete from Book where bookid = '" +bookid+ "'";
			PreparedStatement stmt = connection.prepareStatement(s3);
			stmt.executeUpdate();
			return true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public void fetchBookDetails() {
		try {
			Connection connection = Helpher.createConnection();
			Statement stmt = connection.createStatement();
			String s = "Select * from ecart.Book";
			ResultSet rs = stmt.executeQuery(s);
			
			while(rs.next()) {
				int bookid = rs.getInt(1);
				String bookname = rs.getString(2);
				String bookauthor = rs.getString(3);
				int bookpublish = rs.getInt(4);
				
				
				System.out.println(bookid + " " + bookname + " " + bookauthor + " " + bookpublish );
				}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}