package com.hillel.lessons.lesson13.part1;

public class Tank extends MovableUnit {
    public Tank(int x, int y) {
        super(x, y);
    }

    public void reload() {
        System.out.println("Reload");
    }

    @Override
    public String toString() {
        return "Tank{" +
                "x=" + x +
                ", y=" + y +
                ", immortal=" + immortal +
                '}';
    }
}
