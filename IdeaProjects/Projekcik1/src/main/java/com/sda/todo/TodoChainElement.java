package com.sda.todo;

/**
 * Created by lenovo on 09.06.2017.
 */
public interface TodoChainElement {
    boolean isMyResponsibility(String path);

    String action();


}
