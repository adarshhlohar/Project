package com.yogawebsite.yoga.Reposistories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogawebsite.yoga.Entities.Login;

public interface LoginRepository extends JpaRepository<Login,Integer>{
    public Login findByUserNameAndPassword(String userName,String password);
}
