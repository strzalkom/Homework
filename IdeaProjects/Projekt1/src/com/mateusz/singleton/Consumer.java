package com.mateusz.singleton;

/**
 * Created by lenovo on 02.06.2017.
 */
public class Consumer {
    public static void proccesValue(){
        Queue queue = Queue.getInstance();
        System.out.println("Next value is: " + queue.pop());
    }
}
