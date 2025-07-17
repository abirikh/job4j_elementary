package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Автобус движется по заданному маршруту.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Колличество пассажиров: " + count);
    }

    @Override
    public int refuel(int fuel) {
        int pricePerLiter = 50;
        return fuel * pricePerLiter;
    }
}
