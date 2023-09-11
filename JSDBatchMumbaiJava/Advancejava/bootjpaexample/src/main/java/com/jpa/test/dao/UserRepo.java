package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
