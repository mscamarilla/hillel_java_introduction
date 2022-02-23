package com.hillel.lessons.lesson8;

public class ArraysTwo {

    public static void main(String[] args) {
        char[][] array = new char[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = '.';
            }
        }

        printArray(array);
        fillTop(array);
        fillBottom(array);
        fillDiagonal(array);
        printArray(array);
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillTop(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < j) {
                    array[i][j] = '0';
                }
            }
        }
    }

    public static void fillBottom(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i > j) {
                    array[i][j] = '1';
                }
            }
        }
    }

    public static void fillDiagonal(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][i] = '-';
            }
        }
    }
}
