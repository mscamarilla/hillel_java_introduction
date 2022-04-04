package com.hillel.lessons.lesson14.vehicles;

import com.hillel.lessons.lesson14.details.Engine;
import com.hillel.lessons.lesson14.professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String carClass, Engine engine, Driver driver, String marka) {
        super(carClass, engine, driver, marka);
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                super.toString() +
                "speed=" + speed +
                '}';
    }
}
