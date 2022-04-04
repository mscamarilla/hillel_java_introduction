package com.hillel.lessons.lesson13.part1;

public class Soldier extends MovableUnit {
    public Soldier(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "x=" + x +
                ", y=" + y +
                ", immortal=" + immortal +
                '}';
    }
}
