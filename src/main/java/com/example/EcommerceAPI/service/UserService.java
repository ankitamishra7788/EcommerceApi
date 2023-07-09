package com.example.EcommerceAPI.service;

//import com.example.EcommerceAPI.model.Order;
import com.example.EcommerceAPI.model.User;
import com.example.EcommerceAPI.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public String addUsers(User user) {
        iUserRepo.save(user);
        return "User Added Successfully!!!";
    }

    public User getUserById(Integer userId) {
        return iUserRepo.findByUserId(userId);
    }
}
