package com.bookmaven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "Book_detail")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookid;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "Book name cannot be blank")
	@Min(value = 3)
	private String bookName;
	
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "Author name cannot be blank")
	private String bookAuthor;
	
	@Column(length = 11, nullable = false)
	@NotNull(message = "Book Publish year cannot be blank")
	private long bookPublish;
	
	public Book(int bookid, String bookName, String bookAuthor, int bookPublish) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublish = bookPublish;
	}
	
	public Book() {
		
	}
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public long getBookPublish() {
		return bookPublish;
	}
	public void setBookPublish(Long bookPublish) {
		this.bookPublish = bookPublish;
	}
	
	
	
}
