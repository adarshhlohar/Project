package com.yogawebsite.yoga.ServiceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogawebsite.yoga.Entities.Login;
import com.yogawebsite.yoga.Reposistories.LoginRepository;
import com.yogawebsite.yoga.Services.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
    
    @Autowired
    LoginRepository lRepo;

    @Override
    public Login loginUser(String userName, String password) {
        Login login = lRepo.findByUserNameAndPassword(userName, password);
        return login;
    }


}
