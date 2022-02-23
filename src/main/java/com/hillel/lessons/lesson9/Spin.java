package com.hillel.lessons.lesson9;

public class Spin {

    public static void main(String[] args) throws InterruptedException {
        char[][] array = new char[10][10];

        fillArray(array);
        fillMainDiagonal(array);
        fillAdditionalDiagonal(array);
        printArray(array);

        while (true) {
            //step 1
            fillLeftTriangle(array);
            printArray(array);
            Thread.sleep(500);

            //step 2
            clearTriangle(array);
            fillTopTriangle(array);
            printArray(array);
            Thread.sleep(500);

            //step3
            clearTriangle(array);
            fillRightTriangle(array);
            printArray(array);
            Thread.sleep(500);

            //step 4
            clearTriangle(array);
            fillBottomTriangle(array);
            printArray(array);
            Thread.sleep(500);

            //step 5
            clearTriangle(array);
            Thread.sleep(500);
        }
    }

    private static void fillArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = '.';
            }
        }
    }

    public static void fillMainDiagonal(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][i] = '+';
            }
        }
    }

    public static void fillAdditionalDiagonal(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j == array.length - 1) {
                    array[i][j] = '+';
                }
            }
        }
    }

    private static void clearTriangle(char[][] array) {
        fillArray(array);
        fillMainDiagonal(array);
        fillAdditionalDiagonal(array);
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillLeftTriangle(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < j && i > array.length - 1 - j) {
                    array[i][j] = '+';
                }
            }
        }
    }

    private static void fillRightTriangle(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i > j && i < array.length - 1 - j)) {
                    array[i][j] = '+';
                }
            }
        }
    }

    private static void fillTopTriangle(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((j > i) && (j < array.length - 1 - i)) {
                    array[i][j] = '+';
                }
            }
        }
    }

    private static void fillBottomTriangle(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((j < i) && (j > array.length - 1 - i)) {
                    array[i][j] = '+';
                }
            }
        }
    }
}
