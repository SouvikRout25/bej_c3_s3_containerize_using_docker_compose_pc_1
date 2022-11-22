package com.example.practice.service;

import com.example.practice.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {
    Map<String, String> generateToken(User user);
}