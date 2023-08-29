package com.dao;

import com.entity.Book;

public interface BookDAO {
	boolean addBook(Book b);
	boolean updateBook();
	boolean  deleteBook();
	void fetchBookDetails();
}
