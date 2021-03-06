package com.mateusz.factory;

/**
 * Created by lenovo on 02.06.2017.
 */
public class BMW implements Car{
    private Engine engine;
    private String model;
    private Wheels wheels;
    public BMW(String model, Engine engine, Wheels wheels) {
       this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving with BMW");
        System.out.println("Engine: " + engine.toString());
        System.out.println("Wheels: " + wheels.toString());
    }
    }