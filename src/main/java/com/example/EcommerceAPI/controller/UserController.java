package com.example.EcommerceAPI.controller;

import com.example.EcommerceAPI.model.Order;
import com.example.EcommerceAPI.model.User;
import com.example.EcommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //    Task -- 1 -- Create Users --> Crud Repository (CR) method
    @PostMapping("users")
    public String addUsers(@RequestBody User user) {
        return userService.addUsers(user);
    }

    //    Task -- 2 -> Get user by user_id //GET // I will get user by Custom Finder(CF)
    @GetMapping("users/userId/{userId}")
    public User getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }
}
