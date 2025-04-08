package com.ecom.service;

import com.ecom.model.User;
import com.ecom.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {
       // check user present or not
       User user = userRepository.findByEmail(email);
       if(user != null && user.getPassword().equals(password)){
           return user;
       }
       return null;
       // invalid credential
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
