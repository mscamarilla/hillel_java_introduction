package com.hillel.lessons.lesson13.part1;

public abstract class MovableUnit extends Unit {
    public MovableUnit(int x, int y) {
        super(x, y);
    }

    public void move() {
        x++;
        y++;
    }

    private void fire() {
        System.out.println("fire!");
    }
}
