package com.hillel.lessons.lesson6;

import java.util.Scanner;

public class DataInput {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        double oneTicketCost = 0;
        int totalTickets = 0;
        double extraMoney = 0;
        double accountAgency = 0;
        String result = "";
        String error = "";

        String name = getName();
        printGreetings(name);
        String direction = getDirection();
        int totalPassengers = getTotalPassengers();
        double accountClient = getAccountClientValue();


        switch (direction) {
            case "Rome":
                oneTicketCost = 10;
                totalTickets = 7;
                extraMoney = 1;
            case "Berlin":
                oneTicketCost = 11;
                totalTickets = 6;
                extraMoney = 2;
            case "Prague":
                oneTicketCost = 12;
                totalTickets = 5;
                extraMoney = 3;
            case "Paris":
                oneTicketCost = 13;
                totalTickets = 4;
                extraMoney = 4;
        }

        System.out.println("One ticket cost = " + oneTicketCost);
        System.out.println("Total passengers = " + totalPassengers);
        System.out.println("Direction = " + direction);
        System.out.println("Total flight cost = " + calculateFlightCost(oneTicketCost, totalPassengers));
        System.out.println("Extra Money = " + calculateExtraMoney(extraMoney, totalPassengers));
        System.out.println("You need " + total(oneTicketCost, totalPassengers, extraMoney));

        System.out.println("--------------");
        int ticketsAvailable = isTicketsEnough(totalTickets, totalPassengers);
        if (ticketsAvailable < 0) {
            error += "not enough tickets";
        }
        int difference = totalTickets - totalPassengers;
        printMessageAboutTickets(ticketsAvailable, difference);

        double totalFlightCost = calculateFlightCost(oneTicketCost, totalPassengers) + calculateExtraMoney(extraMoney, totalPassengers);
        boolean solvency = checkSolvency(accountClient, totalFlightCost);

        if (ticketsAvailable >= 0 && solvency) {
            System.out.println("You can buy all tickets");
            moneyTransfer(accountClient, accountAgency, oneTicketCost, totalPassengers);
        } else {
            System.out.println("You don't have enough money");
            if (error != "") {
                error += ", and ";
            }
            error += "you don't have enough money";
        }


        result += "Dear " + name + ", your order is: ";
        result += "Direction - " + direction + ", Passengers - " + totalPassengers + ". ";
        result += "Total cost - " + totalFlightCost + ", you have " + accountClient;
        if (error == "") {
            result += ". Everything is OK. Money left: " + accountClient + ". Have a nice flight!";
        } else {
            result += ", but " + error;
        }
        System.out.println("Result: " + result);


        scanner.close();
    }

    public static void printGreetings(String name) {
        System.out.println("Hello, " + name);
        System.out.println("Welcome to our trip calculator!");
    }

    public static String getName() {
        System.out.println("Please, input your name: ");
        return scanner.next();
    }

    public static String getDirection() {
        System.out.println("Choose direction from available list: 1 - Rome, 2 - Berlin, 3 - Prague, 4 - Paris");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    return "Rome";
                case "2":
                    return "Berlin";
                case "3":
                    return "Prague";
                case "4":
                    return "Paris";
                default:
                    System.out.println("Error: input number from 1 to 4");
            }
        }
        return "";
    }

    public static Integer getTotalPassengers() {
        int totalPassengers = -1;
        while (totalPassengers < 0) {
            System.out.println("Input total passengers: ");
            totalPassengers = validateInt();
            if (totalPassengers < 0) {
                System.out.println("Error: input number");
            }
        }
        return totalPassengers;
    }

    public static double getAccountClientValue() {
        int accountClient = -1;
        //Упростил условие и метод
        while (accountClient < 0) {
            System.out.println("Input your account balance: ");
            accountClient = validateInt();
            if (accountClient < 0) {
                System.out.println("Error: input number");
            }
        }
        return accountClient;
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
            for (int i = 1; totalPassengers > 0; i++) {
                --totalPassengers;
                if (checkSolvency(accountClient, oneTicketCost)) {
                    accountAgency += oneTicketCost;
                    accountClient -= oneTicketCost;
                    System.out.println("You bought " + i + " ticket(s). " + totalPassengers + " left");
                    System.out.println("Money left: " + accountClient);
                } else {
                    System.out.println("You don't have enough money");
                }
            }
        System.out.println("Account balance: " + accountClient);
    }

    public static int validateInt() {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }

    public static double validateDouble() {
        try {
            return Double.parseDouble(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }
}
