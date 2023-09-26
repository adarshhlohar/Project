package com.yogawebsite.yoga.Services;

import com.yogawebsite.yoga.Entities.User;

public interface UserServices {
    User addUser(User user);
    User getUserDetail(int yId);
}
