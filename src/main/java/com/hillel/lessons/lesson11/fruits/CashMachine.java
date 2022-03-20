package com.hillel.lessons.lesson11.fruits;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CashMachine {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private List<Fruit> fruits = new ArrayList<>();

    public void add(Fruit fruit) {
        fruits.add(fruit);
    }

    public void printBill() {
        double summ = 0;
        System.out.println("YOUR BILL:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getColor() + " " + fruit.getType() +" "+ fruit.getWeight() / 1000.0 +" *  "+ fruit.getPricePerKg() + " = " + fruit.getPricePerKg() * fruit.getWeight() / 1000.0);
            summ += fruit.getPricePerKg() * fruit.getWeight() / 1000.0;
        }
        System.out.println("==============");
        System.out.println("TOTAL: " + df.format(summ));
    }

}
