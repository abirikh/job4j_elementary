package ru.job4j.loop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int number = 5;
        int output = Factorial.calculate(number);
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int number = 0;
        int output = Factorial.calculate(number);
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForFourThenTwentyFour() {
        int expected = 24;
        int number = 4;
        int output = Factorial.calculate(number);
        Assertions.assertThat(output).isEqualTo(expected);
    }
}