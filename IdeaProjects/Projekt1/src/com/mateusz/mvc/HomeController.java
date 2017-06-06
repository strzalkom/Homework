package com.mateusz.mvc;

import com.mateusz.builder.User;

/**
 * Created by lenovo on 06.06.2017.
 */
public class HomeController implements Controller {
    @Override
    public Object handle() {
        return new User("Mateusz", "Strzalko", "8219", "2138971283", "22");
    }
}
