package RadixSort;

import java.util.Arrays;

public class RadixSort {

    // sourced from https://www.geeksforgeeks.org/radix-sort/

    static int[] radixSort(int toSortArray[]) {
        int length = toSortArray.length;
        // Find the maximum number to know number of digits
        int max = getMax(toSortArray, length);

        // for each digit run countSort
        for (int digit = 1; max/digit > 0; digit = digit * 10) {
            countSort(toSortArray, length, digit);
        }
        return toSortArray;
    }

    // gets the max so we know how many digits we are working with
    static int getMax(int arr[], int length) {
        int mx = arr[0];
        for (int i = 1; i < length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

   //sorting the digit known form the digit
    static int[] countSort(int returnArray[], int length, int digit) {
        int output[] = new int[length];
        int i;
        int count[] = new int[10];
        //.fills the entire array with the val
        Arrays.fill(count,0);

        // stores the count
        for (i = 0; i < length; i++)
            //
            count[ (returnArray[i]/digit)%10 ]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // works backwords setting the output array
        for (i = length - 1; i >= 0; i--) {
            output[count[ (returnArray[i]/digit)%10 ] - 1] = returnArray[i];
            count[ (returnArray[i]/digit)%10 ]--;
        }

        // Put the output array to returnArray[] so that return array is sorted
        for (i = 0; i < length; i++) {
            returnArray[i] = output[i];
        }
        return returnArray;
    }

}
