package com.sda.Repetition;

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

public class Addres {


    private String city;
    private String street;
    private int flatNumber;
    private String postalCode;
    private String getPostalCode;
}

