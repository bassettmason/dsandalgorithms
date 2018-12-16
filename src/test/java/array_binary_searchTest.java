import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class array_binary_searchTest {

    @Test
    public void searchEmptyArrayTest() {
        int[] array = {1,2,3,4,5};


        int t = 4;
        int f = 7;
        int u = 1;

        assertEquals(ArrayBinarySearch.searchd(array, t), 3);
        assertEquals(ArrayBinarySearch.searchd(array, f), -1);
        assertEquals(ArrayBinarySearch.searchd(array, u), 0);

    }
}
