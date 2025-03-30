package ru.job4j.loop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
class CounterTest {

    @Test
    void sumFrom2To15Is119() {
        int start = 2;
        int finish = 15;
        int expected = 119;
        int output = Counter.sum(start, finish);
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void sumFrom23To34Is342() {
        int start = 23;
        int finish = 34;
        int expected = 342;
        int output = Counter.sum(start, finish);
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void sumFrom8To2Is0() {
        int start = 8;
        int finish = 2;
        int expected = 0;
        int output = Counter.sum(start, finish);
        Assertions.assertThat(output).isEqualTo(expected);
    }
}