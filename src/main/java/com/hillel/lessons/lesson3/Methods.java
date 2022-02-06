package com.hillel.lessons.lesson3;

public class Methods {

    public static void main(String[] args) {
        double totalFlightCost = 0;
        double oneTicketCost = 10.75;
        int totalPassengers = 2;
        String direction = "Prague";

        greetings();

        System.out.println("One ticket cost = " + oneTicketCost);
        System.out.println("Total passengers = " + totalPassengers);
        System.out.println("Direction = " + direction);
        totalFlightCost = calculateFlightCost(oneTicketCost, totalPassengers);
        System.out.println("Total flight cost = " + totalFlightCost);

        double extraMoney = 1.8;
        double totalExtraMoney = calculateExtraMoney(extraMoney, totalPassengers);

        System.out.println("Extra Money = " + totalExtraMoney);

        double totalCost = total(oneTicketCost, totalPassengers, extraMoney);

        System.out.println("You need " + totalCost);
    }

    public static void greetings() {
        System.out.println("Hello!");
        System.out.println("Welcome to our trip calculator!");
    }

    public static double calculateFlightCost(double ticketCost, int totalPassengers) {
        return ticketCost * totalPassengers;
    }

    public static double calculateExtraMoney(double extraMoney, int totalPassengers) {
        return extraMoney * totalPassengers;
    }

    public static double total(double oneTicketCost, int totalPassengers, double extraMoney) {
        return calculateFlightCost(oneTicketCost, totalPassengers) + calculateExtraMoney(extraMoney, totalPassengers);
    }
}
