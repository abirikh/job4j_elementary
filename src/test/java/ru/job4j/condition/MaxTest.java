package ru.job4j.condition;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.job4j.loop.Counter;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxTest {

    @Test
    void whenMiddleValueIsGreatestThenReturnMiddle() {
        int expected = 9;
        int output = Max.max(5, 9, 3);
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenFirstValueIsGreatestThenReturnFirst() {
        int expected = 15;
        int output = Max.max(15, 10, 9, 14);
        Assertions.assertThat(output).isEqualTo(expected);
    }
}