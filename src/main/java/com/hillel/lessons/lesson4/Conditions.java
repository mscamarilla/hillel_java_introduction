package com.hillel.lessons.lesson4;

public class Conditions {

    public static void main(String[] args) {
        double totalFlightCost = 0;
        double oneTicketCost = 10.75;
        int totalPassengers = 2;
        String direction = "Prague";
        int totalTickets = 8;

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

        System.out.println("--------------");
        int ticketsAvailable = isTicketsEnough(totalTickets, totalPassengers);
        int difference = totalTickets - totalPassengers;
        printMessageAboutTickets(ticketsAvailable, difference);

        double accountMoney = 21.5;

        boolean solvency = checkSolvency(accountMoney, totalFlightCost);

        if(ticketsAvailable >=0 && solvency){
            System.out.println("You can buy all tickets");
        }
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

    public static int isTicketsEnough(int totalTickets, int totalPassengers) {
        if (totalTickets > totalPassengers) {
            return 1;
        }

        if (totalTickets == totalPassengers) {
            return 0;
        }

        return -1;
    }

    public static void printMessageAboutTickets(int status, int difference) {
        if (status == -1) {
            System.out.println("Not enough tickets! " + difference + " missing");
        }

        if (status == 0) {
            System.out.println("Enough tickets!");
        }

        if (status == 1) {
            System.out.println("A lot of tickets! " + difference + " left");
        }
    }

    public static boolean checkSolvency(double accountMoney, double totalFlightCost) {
        if ((accountMoney - totalFlightCost) >= 0) {
            return true;
        }
        return false;
    }
}
