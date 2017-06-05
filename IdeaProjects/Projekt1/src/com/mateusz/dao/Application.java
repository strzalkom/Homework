package com.mateusz.dao;

import com.mateusz.builder.User;

import java.io.File;
import java.util.List;

/**
 * Created by lenovo on 05.06.2017.
 */
public class Application {
    private  static final String PATH = "C:\\Users\\lenovo\\IdeaProjects\\Projekt1\\src\\com\\mateusz\\dao\\users";
    public static void main(String[] args) {
        UserDao userDao = new UserDaoInFile(new File(PATH));
        userDao.addUser(User.builder()

                .firstName("Michal")
                .lastName("Andrzejewski")
                .zipCode("12")
                .phoneNumber("123412325346547")
                .age("32332")
                .build());
        List<User> allUsers = userDao.getAllUsers();
        allUsers.forEach(e -> System.out.println(e));
//        allUsers.forEach(System.out::println);
        }
    }

