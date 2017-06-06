package com.mateusz.mvc;

import com.mateusz.builder.User;

/**
 * Created by lenovo on 06.06.2017.
 */
public class JsonView implements View<User> {
    @Override
    public String home(User model) {
       return new StringBuilder()
                .append("{\n")
                .append("\tfirstName: \"" + model.getFirstName() + "\"\n")
                .append("\tlastName: \"" + model.getLastName() + "\"\n")
                .append("\tzipCode: \"" + model.getZipCode() + "\"\n")
                .append("\tphoneNumber: \"" + model.getPhoneNumber() + "\"\n")
                .append("\tage: \"" + model.getAge() + "\"\n")
                .append("}").toString();


    }

}
