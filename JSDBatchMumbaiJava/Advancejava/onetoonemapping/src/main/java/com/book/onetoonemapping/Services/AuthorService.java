package com.book.onetoonemapping.Services;


import com.book.onetoonemapping.Entities.Author;

public interface AuthorService {
    
    Author addAuthor(Author author) ;
	
	Author getAuthorDetail(int aid);
	
	Author updateAuthorDetail(Author author, int aid);
	
	void deleteAuthor(int aid);
    
}
