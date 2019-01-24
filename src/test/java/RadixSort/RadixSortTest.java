package RadixSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class RadixSortTest {

    @Test
    public void radixSortTest() {

        int[] testArray1 = new int[]{566, 125, 299, 101, 301};
        int[] testArray2 = new int[]{555, 555, 555, 555, 555};
        int[] testArray3 = new int[]{111, 222, 333, 444, 555};
        int[] testArray4 = new int[]{95};

        // Sort the Arrays
        int[] expected1 = new int[]{101, 125, 299, 301, 566};
        int[] expected2 = new int[]{555, 555, 555, 555, 555};
        int[] expected3 = new int[]{111, 222, 333, 444, 555};
        int[] expected4 = new int[]{95};

        // Test the Arrays
        assertArrayEquals(expected1, RadixSort.radixSort(testArray1));
        assertArrayEquals(expected2, RadixSort.radixSort(testArray2));
        assertArrayEquals(expected3, RadixSort.radixSort(testArray3));
        assertArrayEquals(expected4, RadixSort.radixSort(testArray4));



        }
}