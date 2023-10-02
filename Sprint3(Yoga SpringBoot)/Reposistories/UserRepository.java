package com.yogawebsite.yoga.Reposistories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogawebsite.yoga.Entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    
}
