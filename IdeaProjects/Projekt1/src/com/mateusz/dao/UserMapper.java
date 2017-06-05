package com.mateusz.dao;

import com.mateusz.builder.User;

/**
 * Created by lenovo on 05.06.2017.
 */
public class UserMapper {
    public User map(String userInString){
       String[] split = userInString.split(";");
       return new User(split[0], split[1], split[2], split[3], split[4]);
    }
public String map(User user){
    StringBuilder stringBuilder = new StringBuilder();
    return stringBuilder
            .append(user.getFirstName())
            .append(";")
            .append(user.getLastName())
            .append(";")
            .append(user.getAge())
            .append(";")
            .append(user.getPhoneNumber())
            .append(";")
            .append(user.getZipCode())
            .append(";")
            .toString();



}
}
