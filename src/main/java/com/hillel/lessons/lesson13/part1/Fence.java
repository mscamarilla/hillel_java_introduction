package com.hillel.lessons.lesson13.part1;

public class Fence extends Unit {
    public Fence(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Fence{" +
                "x=" + x +
                ", y=" + y +
                ", immortal=" + immortal +
                '}';
    }
}
