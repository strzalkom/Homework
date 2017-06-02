package com.mateusz.factory;

/**
 * Created by lenovo on 02.06.2017.
 */
public class Wheels {
    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    private int size;
    private String type;



    public Wheels(int size, String type){
        this.size = size;
        this.type = type;

    }

    @Override
    public String toString() {
        return "4Wheels{"+ "size" + size + ", type= " +type + '\'' + '}';
    }
}
