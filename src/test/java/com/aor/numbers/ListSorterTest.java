package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {

    @Test
    public void sort() {
        List<Integer> list = helper();
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }
    public List helper() {
        List<Integer> helper = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
        return helper;
    }
}
