package com.mateusz.dao;

import com.mateusz.builder.User;

import java.util.List;

/**
 * Created by lenovo on 05.06.2017.
 */
//dao - data access object
public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
}
