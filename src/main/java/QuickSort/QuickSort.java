package QuickSort;

public class QuickSort {
    //www.vogella.com/tutorials/JavaAlgorithmsQuicksort/article.html

    private int[] numbers;
    private int toSortLength;
// a wrapper around the function
    public int[] quickSort(int[] toSortArray) {
        if (toSortArray == null || toSortArray.length == 0){
            return toSortArray;
        }
        numbers = toSortArray;
        toSortLength = toSortArray.length;
        return quickSort(0, toSortLength - 1);

    }

    private int[] quickSort(int start, int end) {
        int i = start, j = end;

        int pivot = numbers[start + (end-start)/2];

        while (i <= j) {
//this is checking if the values in the left list(and right) are lower or higher than the pivot which was grabbed from the middle

            while (numbers[i] < pivot) {
                i++;
            }
         //going backwards now (--) checking right list
            while (numbers[j] > pivot) {
                j--;
            }

        // this is a swap of values if they are in the wrong spot then incrementing as normal
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        // Recursively calling on the left and the right
        if (start < j) {
            quickSort(start, j);
        }
        if (i < end) {
            quickSort(i, end);
        }
        return numbers;
    }
//helper function for the swap just makes them swap using a temp
    private void swap(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }


}
