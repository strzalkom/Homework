package com.sda.Repetition;

import com.sda.Repetition.Addres;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lenovo on 01.07.2017.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private Addres addres;

}
