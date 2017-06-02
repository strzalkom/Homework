package com.mateusz.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 02.06.2017.
 */
public class AbstractCarFactory {
    private Map<CarFactoriesEnums, CarFactor> factories;


        public AbstractCarFactory() {
        this.factories = new HashMap<>();
   initFactories();

    }
    public Car buildAudiCar(String model){
      return buildCar(CarFactoriesEnums.AUDI, model);
    }
    public Car buildBMWCar(String model){
       return buildCar(CarFactoriesEnums.BMW, model);
    }
    public Car buildMercedes(String model){
        return buildCar(CarFactoriesEnums.MERCEDES, model);
    }
    private void initFactories(){
       factories.put(CarFactoriesEnums.AUDI, new AudiCarFactory());
       factories.put(CarFactoriesEnums.BMW, new BMWCarFactory());
       factories.put(CarFactoriesEnums.MERCEDES, new MercedesCarFactory());
    }
    public Car buildCar(CarFactoriesEnums type, String model) {
        return factories.get(type).buildCar(model);
    }
    }
