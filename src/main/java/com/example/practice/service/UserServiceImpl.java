package com.example.practice.service;

import com.example.practice.domain.User;
import com.example.practice.exception.UserNotFoundException;
import com.example.practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUserNameAndUserPassword(String userName, String userPassword) throws UserNotFoundException {
        User user = userRepository.findByUserNameAndUserPassword(userName,userPassword);
        if(user == null){
            throw new UserNotFoundException();
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}