package com.hillel.lessons.lesson14.professions;

public class Driver extends Person {
    private int experience;

    public Driver(String dayOfBirth, String fullName) {
        super(dayOfBirth, fullName);
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                super.toString() +
                "experience=" + experience +
                '}';
    }
}
