package com.hillel.lessons.lesson12;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> people = new ArrayList<Object>();
        PersonFactory personFactory = new PersonFactory();
        people = personFactory.generatePersons();

        printPeople(people);

    }

    public static void printPeople(ArrayList people) {
        for (Object person : people) {
            System.out.println(person.toString());
        }
    }
}
