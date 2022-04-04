package com.hillel.lessons.lesson13.part2;

public class Main {
    public static void main(String[] args) {
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        System.out.println(string);
        String reverted = revert(string);
        System.out.println(reverted);

    }

    public static String revert(String string) {
        String result = "";
        String[] splited = string.split("\\s+");
        for (int i = splited.length - 1; i >= 0; i--) {
            result += (splited[i].substring(0, 1).toUpperCase() + splited[i].substring(1)) + " ";
        }
        return result;
    }
}
