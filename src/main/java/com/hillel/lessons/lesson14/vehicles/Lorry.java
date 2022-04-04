package com.hillel.lessons.lesson14.vehicles;

import com.hillel.lessons.lesson14.details.Engine;
import com.hillel.lessons.lesson14.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String carClass, Engine engine, Driver driver, String marka) {
        super(carClass, engine, driver, marka);
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                super.toString() +
                " carrying=" + carrying +
                '}';
    }
}
