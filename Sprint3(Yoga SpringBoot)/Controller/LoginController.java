package com.yogawebsite.yoga.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yogawebsite.yoga.Entities.Login;
import com.yogawebsite.yoga.Services.LoginService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.ServletException;


@RestController
public class LoginController {
    @Autowired
    LoginService loginSerivice;
    
    @PostMapping("/login")
    public String validate(@RequestBody Login user) throws  ServletException{
        String jwtToken = "";

        if(user.getUserName() == null || user.getPassword() == null) {
            throw new ServletException("Please fill username and password");
        }

        String  userName = user.getUserName();
        String  password = user.getPassword();
        user = loginSerivice.loginUser(userName,password);

        if(user == null){
            throw new ServletException("User Not Found");
        }

        jwtToken = Jwts.builder().claim("roles", "user").setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256,"secretkey").compact();
        
        return jwtToken;
    }

}
