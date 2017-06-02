package com.mateusz.factory;

/**
 * Created by lenovo on 02.06.2017.
 */
public class AudiCarFactory implements CarFactor {
    @Override
    public Car buildCar(String model) {
        Car car = null;
        if(model.equals("A3")) {
            Engine audiEngine = new Engine(200, 3000, "diesel");
            Wheels audiWheels = new Wheels(18, "summer");
            Audi audi = new Audi("A3", audiEngine, audiWheels);
        }else if (model.equals("tt")) {
            Engine audiEngine = new Engine(120, 2000, "gas");
            Wheels audiWheels = new Wheels(17, "winter");
            Audi audi = new Audi("tt",audiEngine,audiWheels);
        }
        return car;
    }
}
