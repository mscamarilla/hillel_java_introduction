package com.hillel.lessons.lesson7;

import com.hillel.lessons.lesson6.DataInput;

import java.net.SocketOption;

public class ArraysOne {

    public static void main(String[] args) {
        String[] directions = new String[]{"Abu Dhabi", "Abuja", "Addis Ababa", "Accra", "Algeria", "Amman", "Amsterdam", "Andorra la Vella", "Ankara", "Antananarivo"};
        double[] prices = new double[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100,};

        String name = getName();
        printGreetings(name);

        printDirections(directions);
        printPrices(prices);
        printReversedDirections(directions);
        printReversedPrices(prices);

        double min = getMin();
        double max = getMax();

        printDirectionsPrices(directions, prices, min, max);
    }

    public static void printDirections(String[] directions) {
        for (String direction : directions) {
            System.out.println(direction);
        }
    }

    public static void printPrices(double[] prices) {
        for (double price : prices) {
            System.out.println(price);
        }
    }

    public static void printReversedDirections(String[] directions) {
        for (int i = directions.length - 1; i >= 0; i--) {
            System.out.println(directions[i]);
        }
    }

    public static void printReversedPrices(double[] prices) {
        for (int i = prices.length - 1; i >= 0; i--) {
            System.out.println(prices[i]);
        }
    }

    public static void printDirectionsPrices(String[] directions, double[] prices, double min, double max) {
        for (int i = 0; i < directions.length; i++) {
            if (prices[i] > min && prices[i] < max) {
                System.out.println("Ticket to " + directions[i] + " costs " + prices[i]);
            }
        }
    }

    public static String getName() {
        System.out.println("Please, input your name: ");
        return DataInput.scanner.next();
    }

    public static void printGreetings(String name) {
        System.out.println("Hello, " + name);
    }

    public static Double getMin() {
        double min = -1;

        while (min < 0) {
            System.out.println("Please, input min range: ");
            min = validateDouble();

            if (min > 0) {
                return min;
            } else {
                System.out.println("Error: input number");
            }
        }
        return min;
    }

    public static Double getMax() {
        double max = -1;

        while (max < 0) {
            System.out.println("Please, input max range: ");
            max = validateDouble();

            if (max > 0) {
                return max;
            } else {
                System.out.println("Error: input number");
            }
        }
        return max;
    }

    public static double validateDouble() {
        try {
            return Double.parseDouble(DataInput.scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }
}
