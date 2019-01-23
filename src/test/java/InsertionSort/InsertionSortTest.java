package InsertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void insertionSortTest() {
        int[] input = {6, 2, 3, 4, 5, 1};
        InsertionSort.insertionSort(input);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, input);
    }

    @Test
    public void insertionSortSingleTest() {
        int[] input = {6};
        InsertionSort.insertionSort(input);
        int[] expected = {6};
        assertArrayEquals(expected, input);
    }

    @Test
    public void insertionSortEmptyTest() {
        int[] input = {};
        InsertionSort.insertionSort(input);
        int[] expected = {};
        assertArrayEquals(expected, input);
    }

}