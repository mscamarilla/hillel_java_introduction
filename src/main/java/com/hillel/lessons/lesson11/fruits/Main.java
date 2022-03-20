package com.hillel.lessons.lesson11.fruits;

public class Main {

    public static void main(String[] args) {
        Fruit greenApple = new Fruit(Color.GREEN, Fruit.Type.APPLE, 216, 14.90);
        Fruit redApple = new Fruit(Color.RED, Fruit.Type.APPLE, 262, 20.90);
        Fruit orange = new Fruit(Color.ORANGE, Fruit.Type.ORANGE, 322, 49.90);
        Fruit carrot = new Fruit(Color.ORANGE, Fruit.Type.CARROT, 404, 15.80);

        CashMachine cashMachine = new CashMachine();
        cashMachine.add(greenApple);
        cashMachine.add(redApple);
        cashMachine.add(orange);
        cashMachine.add(carrot);
        cashMachine.printBill();
    }

}
