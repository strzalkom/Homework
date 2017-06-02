package com.mateusz.factory;

/**
 * Created by lenovo on 02.06.2017.
 */
public class BMWCarFactory implements CarFactor {

    @Override
    public Car buildCar(String model) {
        Car car = null;
        if(model.equals("X5")) {
            Engine audiEngine = new Engine(180, 3000, "diesel");
            Wheels audiWheels = new Wheels(20, "summer");
            Audi audi = new Audi("A3", audiEngine, audiWheels);
        }else if (model.equals("M3")) {
            Engine audiEngine = new Engine(120, 2000, "gas");
            Wheels audiWheels = new Wheels(17, "winter");
            Audi audi = new Audi("M3",audiEngine,audiWheels);
        }
        return car;

    }
}
