//package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        //long amount = 1_000_000;
        //boolean registered = true;
        //long expected = 500;

        //long actual = service.calculate(amount, registered);
    }
}