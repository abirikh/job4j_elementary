package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Factorial.calc(-2);
                });
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0.");
    }

    @Test
    public void whenTheFactorialOf4Is24() {
        int number = 4;
        int result = Factorial.calc(number);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }
}