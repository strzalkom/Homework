package com.mateusz.factory;

/**
 * Created by lenovo on 02.06.2017.
 */
public class Engine {
    private int horsePower;

    private int capicity;

    private  String type;


    public int getHorsePower() {
        return horsePower;
    }

    public int getCapicity() {
        return capicity;
    }

    public String getType() {
        return type;
    }

    public Engine(int horsePower, int capicity, String type) {
        this.horsePower = horsePower;
        this.capicity = capicity;
        this.type = type;
    }


    @Override
    public String toString() {
        return "Engine{" + "horsePower" + horsePower + ", capicity= " + capicity + ", type= " + type + '/'+ '}';
    }
    }




