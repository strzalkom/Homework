package com.mateusz.dao;

import com.mateusz.builder.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 05.06.2017.
 */
public class UserDaoInMemory implements UserDao {
   private List<User>users;

  public UserDaoInMemory(){
      users = new ArrayList<>();
      User.builder()
              .firstName("Matuesz")
              .lastName("Strzalko")
              .age("22")
              .phoneNumber("3141421241")
              .build();

      users.add(User.builder()
              .firstName("Anna")
              .lastName("Nowak")
              .age("44")
              .phoneNumber("43543545325")
              .build());
  }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
