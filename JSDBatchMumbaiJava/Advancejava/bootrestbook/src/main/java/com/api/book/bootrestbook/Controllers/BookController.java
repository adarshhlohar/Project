package com.api.book.bootrestbook.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.Services.BookServices;
import com.api.book.bootrestbook.entities.Book;


@RestController
public class BookController {
    
    @Autowired
    private BookServices bs;

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return this.bs.getBooks();
    }

    @GetMapping("/getBook/{id}")
    public Book getBook(@PathVariable("id") int id){
        return this.bs.getBook(id);
    }
}
