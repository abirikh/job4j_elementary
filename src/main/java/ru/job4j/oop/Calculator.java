package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int minus(int m) {
        return m - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int s) {
        return sum(s) + minus(s) + divide(s) + multiply(s);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sumAllOperation(5);
        System.out.println(result);
    }
}