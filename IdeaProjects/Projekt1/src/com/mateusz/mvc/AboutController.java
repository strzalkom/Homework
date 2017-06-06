package com.mateusz.mvc;

import com.mateusz.builder.User;

/**
 * Created by lenovo on 06.06.2017.
 */
public class AboutController implements Controller {
    @Override
    public Object handle(){
        return new User("asdads", "asdsad", "123312", "1221121221212121", "20");
    }
}
