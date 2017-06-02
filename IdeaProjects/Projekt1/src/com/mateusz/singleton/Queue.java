package com.mateusz.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 02.06.2017.
 */
public class Queue {
private static Queue instance = null;
private List<String> values;

public static Queue getInstance() {
    if (instance == null) {
        instance = new Queue() ;
    }
return instance;
}
private Queue() {
    values = new ArrayList<>();

}
public void push (String value) {
    values.add(value);
}
public String pop() {
    String valueToReturn = null;
    if (values.size() > 0) {
       valueToReturn = values.remove(0);
}
return valueToReturn;
}
}
