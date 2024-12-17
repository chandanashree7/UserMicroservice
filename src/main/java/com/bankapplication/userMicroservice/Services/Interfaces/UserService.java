package com.bankapplication.userMicroservice.Services.Interfaces;

import com.bankapplication.userMicroservice.Model.User;

public interface UserService {

    public User getByUserId(Long user_Id);

    public String saveUser(User user);


}
