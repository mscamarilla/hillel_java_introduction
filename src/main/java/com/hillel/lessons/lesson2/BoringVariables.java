package com.hillel.lessons.lesson2;

public class BoringVariables {
    public static void main(String[] args) {

        //Заданиие 1
        byte byteType = 10;
        short shortType = 20;
        int intType = 30;
        long longType = 40;

        System.out.println("Minimum for byte is " + Byte.MIN_VALUE);
        System.out.println("Maximum for byte is " + Byte.MAX_VALUE);
        System.out.println("Minimum for short is " + Short.MIN_VALUE);
        System.out.println("Maximum for short is " + Short.MAX_VALUE);
        System.out.println("Minimum for int is " + Integer.MIN_VALUE);
        System.out.println("Maximum for int is " + Integer.MAX_VALUE);
        System.out.println("Minimum for long is " + Long.MIN_VALUE);
        System.out.println("Maximum for long is " + Long.MAX_VALUE);

        //Заданиие 2
        shortType = byteType;
        intType = byteType;

        System.out.println("Неявное приведение типов: " + shortType);
        System.out.println("Неявное приведение типов: " + intType);

        byteType = (byte) shortType;
        intType = (int) longType;

        System.out.println("Явное приведение типов: " + byteType);
        System.out.println("Явное приведение типов: " + intType);

        //Заданиие 3
        byteType = (byte) 129;
        shortType = (short) 32769;
        intType = (int) 2147483649L;

        System.out.println("На самом деле byteType =  " + byteType);
        System.out.println("На самом деле shortType =  " + shortType);
        System.out.println("На самом деле intType =  " + intType);


    }
}