package com.book.onetoonemapping.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.book.onetoonemapping.Entities.Author;

public interface AuthorRepository extends JpaRepository<Author,Integer>{
    
}
