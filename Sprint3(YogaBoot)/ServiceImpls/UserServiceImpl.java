package com.yogawebsite.yoga.ServiceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogawebsite.yoga.Entities.User;
import com.yogawebsite.yoga.Exception.UserNotFoundException;
import com.yogawebsite.yoga.Reposistories.UserRepository;
import com.yogawebsite.yoga.Services.UserServices;

@Service
public class UserServiceImpl implements UserServices{
    
    @Autowired
    UserRepository uRepo;

    @Override
    public User addUser(User user) {
        return uRepo.save(user);
    }

    @Override
    public User getUserDetail(int yId) {
        return uRepo.findById(yId).orElseThrow(() -> new UserNotFoundException("Entered User Id Not Present"));
    }


}
