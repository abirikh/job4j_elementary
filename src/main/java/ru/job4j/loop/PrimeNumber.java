package ru.job4j.loop;

import static ru.job4j.loop.CheckPrimeNumber.*;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (check(i)) {
                count += 1;
            }
        }
        return count;
    }
}
