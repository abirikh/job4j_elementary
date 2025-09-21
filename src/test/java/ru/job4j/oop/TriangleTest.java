package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void whenOrdinaryTriangleThenCorrectArea() {
        Point a = new Point(1, 1);
        Point b = new Point(4, 5);
        Point c = new Point(6, 2);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8.5;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00and30and04Then6() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 6;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00and00and00ThenException() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        triangle.area();
    }

    @Test
    public void whenAllPointsEqualThenReturnMinusOne() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result).isEqualTo(-1);
    }
}
