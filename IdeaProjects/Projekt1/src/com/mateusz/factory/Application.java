package com.mateusz.factory;

/**
 * Created by lenovo on 02.06.2017.
 */
public class Application {
    public static void main(String[] args) {
//        AudiCarFactory audiCarFactory = new AudiCarFactory();
//        Car car = audiCarFactory.buildCar("A3");
AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
Car car =abstractCarFactory.buildAudiCar("A3");
Car car2 =abstractCarFactory.buildBMWCar("AMG");
Car car3 =abstractCarFactory.buildBMWCar("X5");

//
//        Engine audiEngine = new Engine(200, 3000, "diesel");
//        Wheels audiWheels = new Wheels(18, "summer");
//        Audi audi = new Audi("A3",audiEngine,audiWheels);
//
//        audi.drive();
//
//        Engine mercedesEngine = new Engine(300, 3000, "gas");
//        Wheels mercedesWheels = new Wheels(19, "winter");
//        Mercedes mercedes = new Mercedes("AMG", mercedesEngine,mercedesWheels);
//       mercedes.drive();
//
//        Engine BMWEngine = new Engine(300, 3000, "gas");
//        Wheels BMWWheels = new Wheels(19, "winter");
//       BMW bmw = new BMW("X5", BMWEngine,BMWWheels);
//        mercedes.drive();
//
//    }

    }
}
