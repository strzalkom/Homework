package com.mateusz.factory;

/**
 * Created by lenovo on 02.06.2017.
 */
public class MercedesCarFactory implements CarFactor {
    @Override
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("AMG")) {
            Engine audiEngine = new Engine(300, 3000, "gas");
            Wheels audiWheels = new Wheels(19, "winter");
            Audi audi = new Audi("AMG", audiEngine, audiWheels);
        } else if
            (model.equals("s600")) {
                Engine audiEngine = new Engine(200, 2000, "diesel");
                Wheels audiWheels = new Wheels(17, "summer");
                Audi audi = new Audi("s600", audiEngine, audiWheels);
            }
            return car;
        }
    }


