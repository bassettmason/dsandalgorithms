import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void insertShiftArray() {
        int[] array1 = {1,2,3,5,6,7};
        int v1 = 4;
        int[] returnArray1 = {1,2,3,4,5,6,7};

        int[] array2 = {1,2,3,5,6,7,8};
        int v2 = 4;
        int[] returnArray2 = {1,2,3,5,4,6,7,8};

        int[] array3 = {};
        int v3 = 5;
        int[] returnArray3 = {5};

        assertArrayEquals(ArrayShift.insertShiftArray(array1, v1), returnArray1);
        assertArrayEquals(ArrayShift.insertShiftArray(array2, v2), returnArray2);
        assertArrayEquals(ArrayShift.insertShiftArray(array3, v3), returnArray3);
    }


}