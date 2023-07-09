package com.example.EcommerceAPI.repository;

import com.example.EcommerceAPI.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User, Integer> {
    User findByUserId(Integer userId);
}
