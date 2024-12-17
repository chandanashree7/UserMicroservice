package com.bankapplication.userMicroservice.Services;


import com.bankapplication.userMicroservice.Model.User;
import com.bankapplication.userMicroservice.Repositories.UserRepository;
import com.bankapplication.userMicroservice.Services.Interfaces.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User getByUserId(Long user_Id) {
        Optional<User> findById = userRepo.findById(user_Id);
        if (findById.isPresent()) {
            return findById.get();
        }
        return null;
    }

    @Override
    public String saveUser(User user) {
        return userRepo.save(user).toString();
    }



}
