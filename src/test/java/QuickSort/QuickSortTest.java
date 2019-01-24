package QuickSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {

   //www.vogella.com/tutorials/JavaAlgorithmsQuicksort/article.html


    @Test
    public void quickSortNullTest() {
        QuickSort sorter = new QuickSort();

        assertEquals(null, sorter.quickSort(null) );

    }

    @Test
    public void quickSortEmptyTest() {
        QuickSort sorter = new QuickSort();
        int [] expected = new int[0];
        assertEquals(expected, sorter.quickSort(expected) );
    }

    @Test
    public void quickSortSingleTest() {
        QuickSort sorter = new QuickSort();
        int[] test = new int[1];
        test[0] = 5;
        assertArrayEquals(test,sorter.quickSort(test));
    }

    @Test
    public void quickSortTest() {
        QuickSort sorter = new QuickSort();

        int[] test = {7,3,12};
        int[] expected = {3,7,12};
        int[] actual = sorter.quickSort(test);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void quickSortOrderedTest() {
        QuickSort sorter = new QuickSort();

        int[] test = {3,7,12};
        int[] expected = {3,7,12};
        int[] actual = sorter.quickSort(test);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void quickSortReverseTest() {
        QuickSort sorter = new QuickSort();

        int[] test = {12,3,1};
        int[] expected = {1,3,12};
        int[] actual = sorter.quickSort(test);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void quickSortDupTest() {
        QuickSort sorter = new QuickSort();
        int[] test = { 5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5 };
        int[] expected = { 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6 };


        assertArrayEquals(expected, sorter.quickSort(test));
    }

}
