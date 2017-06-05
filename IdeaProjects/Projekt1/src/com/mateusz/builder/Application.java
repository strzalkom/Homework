package com.mateusz.builder;

/**
 * Created by lenovo on 05.06.2017.
 */


public class Application {
    public static void main(String[] args) {
      User user = User.builder()
              .firstName("Mateusz")
              .lastName("Strzalko")
              .age("23")
              .phoneNumber("1421412214")
              .zipCode("1341245")
              .build();


        System.out.println(user);
    }


}
