package com.example.excercise1.service;

import com.example.excercise1.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    void save(User user);
}
