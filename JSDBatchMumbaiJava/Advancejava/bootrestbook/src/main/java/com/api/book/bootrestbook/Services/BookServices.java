package com.api.book.bootrestbook.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.entities.Book;

@Component
public class BookServices {
    static private List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(1001, "java", "james gosling"));
        list.add(new Book(1002, "javaScript", "bredan eich"));
        list.add(new Book(1003, "cpp", "bjarne stroustrop"));
    }

    public List<Book> getBooks() {
        return list;
    }

    public Book getBook(int id){
        Book book = list.stream().filter(e-> e.getId() == id).findFirst().get();
        return book;
    }
}
