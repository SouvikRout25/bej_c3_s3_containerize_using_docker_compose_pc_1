package com.example.practice.service;

import com.example.practice.domain.User;
import com.example.practice.exception.UserNotFoundException;

import java.util.List;

public interface UserService {

    public User addUser(User user);
    public User findByUserNameAndUserPassword(String userName, String userPassword) throws UserNotFoundException;
    public List<User> getAllUsers();
}
