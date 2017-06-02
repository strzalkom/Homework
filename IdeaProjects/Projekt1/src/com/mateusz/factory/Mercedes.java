package com.mateusz.factory;

/**
 * Created by lenovo on 02.06.2017.
 */
public class Mercedes implements Car {
    private Engine engine;
    private String model;
    private Wheels wheels;

    public Mercedes(String model, Engine engine, Wheels wheels) {
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving with Mercedes");
        System.out.println("Engine: " + engine.toString());
        System.out.println("Wheels: " + wheels.toString());
    }
}