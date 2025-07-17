package ru.job4j.cast;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();

        Vehicle[] vehicles = {bus, plane, train};
        for (Vehicle object : vehicles) {
            object.move();
            object.fuel();
        }
    }
}
