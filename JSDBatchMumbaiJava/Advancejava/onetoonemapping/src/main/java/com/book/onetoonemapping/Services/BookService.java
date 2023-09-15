package com.book.onetoonemapping.Services;

import com.book.onetoonemapping.Entities.Book;

public interface BookService {
    
    Book addAuthor(Book book) ;
	
	Book getAuthorDetail(int sid);
	
	Book updateAuthorDetail(Book book, int sid);
	
	void deleteAuthor(int sid);
}