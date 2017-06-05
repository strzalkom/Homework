package com.mateusz.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Created by lenovo on 05.06.2017.
 */
@AllArgsConstructor
@Builder
@Data
public class User {

    private String firstName;
    private String lastName;
    private String zipCode;

    private String phoneNumber;
    private String age;

}