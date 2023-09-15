package com.book.onetoonemapping.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.book.onetoonemapping.Entities.Author;
import com.book.onetoonemapping.Repositories.AuthorRepository;
import com.book.onetoonemapping.Services.AuthorService;

public class AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthorRepository Arepo;

    @Override
    public Author addAuthor(Author author) {
        return Arepo.save(author);
    }

    @Override
    public Author getAuthorDetail(int aid) {
        return Arepo.findById(int aid);
    }

    @Override
    public Author updateAuthorDetail(Author author, int aid) {
        Author newAuth = Arepo.findById(aid);
        newAuth.setLanguage(Author.getLanguage());
        Arepo.save(newAuth);
        return newAuth;
    }

    @Override
    public void deleteAuthor(int sid) {
        
    }
    
}
