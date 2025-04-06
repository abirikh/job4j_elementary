package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {5, 8, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 5, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {15, 52, 13, 21, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {11, 13, 15, 21, 52};
        assertThat(result).containsExactly(expected);
    }
}