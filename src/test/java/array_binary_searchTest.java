import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class array_binary_searchTest {

    @Test
    public void searchEmptyArrayTest() {
        int[] array = {1,2,3,4,5};


        int t = 4;


        assertEquals(array_binary_search.searchd(array, t), 3);

    }
}
