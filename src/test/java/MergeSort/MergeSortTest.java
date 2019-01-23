package MergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSortTest() {

        int[] actual = { 2, 5, 6, 1, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void mergeSortSingleTest() {

        int[] actual = {2};
        int[] expected = {2};
        MergeSort.mergeSort(actual);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void mergeSortSortedTest() {

        int[] actual = { 1, 2, 3, 4, 5, 6 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void mergeSortReverseTest() {

        int[] actual = { 6, 5, 4, 3, 2, 1};
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void mergeTest() {
        int[] array1 = { 1, 5, 6 };
        int[] array2 = { 2, 3, 4 };
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] list = new int[6];
        assertArrayEquals(expected, MergeSort.merge(array1, array2, list));

    }
//
    @Test
    public void mergeSingleTest() {
        int[] array1 = {1};
        int[] array2 = {2};
        int[] expected = {1, 2};
        int[] list = new int[2];
        assertArrayEquals(expected, MergeSort.merge(array1, array2, list));

    }

    @Test
    public void mergeEmptyTest() {
        int[] array1 = {};
        int[] array2 = {};
        int[] expected = {};
        int[] list = new int[0];
        assertArrayEquals(expected, MergeSort.merge(array1, array2, list));

    }
}