package com.hillel.lessons.lesson14;

import com.hillel.lessons.lesson14.details.Engine;
import com.hillel.lessons.lesson14.professions.Driver;
import com.hillel.lessons.lesson14.vehicles.Car;
import com.hillel.lessons.lesson14.vehicles.Lorry;

public class Main {
    public static void main(String[] args) {
        Driver lorryDriver = new Driver("18.12.1985", "Водитель Грузовика Вася");
        System.out.println(lorryDriver);
        lorryDriver.setExperience(2);
        Engine lorryEngine = new Engine(120, "LCompany");
        Lorry lorry = new Lorry("Lorry", lorryEngine, lorryDriver, "MAN");
        lorry.setCarrying(500);
        lorry.start();
        lorry.turnLeft();
        lorry.turnRight();
        lorry.stop();
        System.out.println(lorry);

    }
}
