package InsertionSort;

public class InsertionSort {
// resources https://www.baeldung.com/java-insertion-sort

    public static void insertionSort(int[] input) {

        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            //j is offset of i by one for comparison to the key
            int j = i - 1;
            //while j is bigger than the key it keep moving until it finds its location
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            //then it inserts here
            input[j + 1] = key;
        }
    }


}
