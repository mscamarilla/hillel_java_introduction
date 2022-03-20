package com.hillel.lessons.lesson10;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {
        stringMethods();
        System.out.println(maxValue(10, 20, 30, 5, 1));
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
        System.out.println(isOnlyNumbers("123123123t"));

    }

    public static void stringMethods() {
        String string = "Sample String";
        String string2 = "sample string";

        // charAt
        System.out.println("5-th letter is " + string.charAt(4));

        // contains
        System.out.println("Contains sequence 'ing': " + string.contains("ing"));

        // endsWith
        System.out.println("EndsWith character 'e': " + string.endsWith("e"));

        // startsWith
        System.out.println("StartsWith character 'D': " + string.endsWith("D"));

        // equals
        System.out.println("Equals 'sample string': " + string.equals(string2));

        // equalsIgnoreCase
        System.out.println("EqualsIgnoreCase 'sample string': " + string.equalsIgnoreCase(string2));

        // format
        String text = String.format("User info - name: %s, age: %d years, friend: %s, weight: %d kg", "John", 25, "Max", 88);
        System.out.println(text);

        // indexOf
        System.out.println("Index of letter 'e' in string '" + string + "' is " + string.indexOf("e"));

        // isEmpty
        System.out.println("String is empty: " + string.isEmpty());

        // length
        System.out.println("Length = " + string.length());

        // replace
        System.out.println("Replace 'e' to 'a' = " + string.replace("e", "a"));

        // substring
        System.out.println("Substring from 3 to 8 is '" + string.substring(3, 8) + "'");

        // toLowerCase
        System.out.println("To Lower Case: " + string.toLowerCase(Locale.ROOT));

        // toUpperCase
        System.out.println("To Upper Case: " + string.toUpperCase(Locale.ROOT));

        // trim
        System.out.println("Trim '" + string.trim());

        // split
        String[] words = string.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static int maxValue(int... ints) {
        int maxValue = 0;

        for (int anInt : ints) {
            if (anInt > maxValue) {
                maxValue = anInt;
            }
        }

        return maxValue;
    }

    public static boolean isPalindrome(String str) {
        String reverseStr = "";
        str = str.replace(" ", "");

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        return str.toLowerCase().equals(reverseStr.toLowerCase());
    }

    public static boolean isOnlyNumbers(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
