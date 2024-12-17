package com.bankapplication.userMicroservice.Controller;

import com.bankapplication.userMicroservice.Model.User;
import com.bankapplication.userMicroservice.Services.Interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody User user){
        String user1=userService.saveUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);

    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable Long userId){
        User user=userService.getByUserId(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }



}
