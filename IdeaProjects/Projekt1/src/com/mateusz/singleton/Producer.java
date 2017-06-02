package com.mateusz.singleton;

/**
 * Created by lenovo on 02.06.2017.
 */
public class Producer {
    public static void addValue(String value){
        Queue.getInstance().push(value);

    }
}
