package com.hillel.lessons.lesson13.part1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fence fence = new Fence(1, 1);
        Tower tower = new Tower(2, 3);
        Soldier soldier = new Soldier(4, 5);
        Tank tank = new Tank(6, 7);

        List<Unit> units = new ArrayList<>();
        units.add(fence);
        units.add(tower);
        units.add(soldier);
        units.add(tank);

        draw(units);
    }

    public static void draw(List<Unit> units) {
        for (Unit unit : units) {
            System.out.println("draw " + unit.toString());
        }
    }
}
