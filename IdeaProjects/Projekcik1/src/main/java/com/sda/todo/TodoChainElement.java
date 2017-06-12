package com.sda.todo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lenovo on 09.06.2017.
 */
public interface TodoChainElement {
    boolean isMyResponsibility(String path);

    String action(HttpServletRequest req, HttpServletResponse resp);


}
