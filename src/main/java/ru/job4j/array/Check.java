package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
           boolean reference = data[0];
           if (reference != data[i]) {
               result = false;
           }
        }
        return result;
    }
}