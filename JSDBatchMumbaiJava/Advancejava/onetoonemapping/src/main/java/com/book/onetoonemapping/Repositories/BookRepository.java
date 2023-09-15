package com.book.onetoonemapping.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.onetoonemapping.Entities.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
    
}
