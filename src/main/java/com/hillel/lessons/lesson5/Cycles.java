package com.hillel.lessons.lesson5;

public class Cycles {

    public static void main(String[] args) {
        double totalFlightCost = 0;
        double oneTicketCost = 10.75;
        int totalPassengers = 2;
        String direction = "Prague";
        int totalTickets = 8;

        printGreetings();

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

        double accountClient = 26;
        double accountAgency = 0;

        boolean solvency = checkSolvency(accountClient, totalFlightCost);

        if (ticketsAvailable >= 0 && solvency) {
            System.out.println("You can buy all tickets");
            moneyTransfer(accountClient, accountAgency, oneTicketCost, totalPassengers);
        } else {
            System.out.println("You don't have enough money");
        }
    }

    public static void printGreetings() {
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
        return Integer.compare(totalTickets, totalPassengers);
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

    public static boolean checkSolvency(double accountClient, double totalFlightCost) {
        return (accountClient - totalFlightCost) >= 0;
    }

    public static void moneyTransfer(double accountClient, double accountAgency, double oneTicketCost, int totalPassengers) {
        while (checkSolvency(accountClient, oneTicketCost)) {
            for (int i = 1; totalPassengers > 0; i++) {
                --totalPassengers;
                if (checkSolvency(accountClient, oneTicketCost)) {
                    accountAgency += oneTicketCost;
                    accountClient -= oneTicketCost;
                    System.out.println("You bought " + i + " ticket(s). " + totalPassengers + " left");
                    System.out.println("Money left: " + accountClient);
                } else {
                    System.out.println("You don't have enough money");
                    break;
                }
            }
        }
        System.out.println("Account balance: " + accountClient);
    }
}
