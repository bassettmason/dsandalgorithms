package MergeSort;

public class MergeSort {
    //resources are https://www.baeldung.com/java-merge-sort   and    https://stackoverflow.com/questions/1735863/merge-sort-java


    public static int[] mergeSort(int[] toOrderArray) {
        int[] returnArray = new int[toOrderArray.length];
        if (toOrderArray.length > 1) {
            // Merge sort the left
            int[] left = new int[toOrderArray.length / 2];
            System.arraycopy(toOrderArray, 0, left, 0, toOrderArray.length / 2);
            mergeSort(left);

            // Merge sort right
            //find length even if uneven
            int rightLength = toOrderArray.length - toOrderArray.length / 2;
            int[] right = new int[rightLength];
            System.arraycopy(toOrderArray, toOrderArray.length / 2, right, 0, rightLength);
            mergeSort(right);

            // Merge everything
             returnArray = merge(left, right, toOrderArray);
        }
        return returnArray;
    }

    public static int[] merge(int[] left, int[] right, int[] toOrderArray) {

        int leftLength = left.length;
        int rightLength = right.length;
        int i=0,j=0, k=0;
        while(i < leftLength && j < rightLength) {
            if(left[i] < right[j]) {
                toOrderArray[k] = left[i];
                i++;
                k++;
            }
            else {
                toOrderArray[k] = right[j];
                j++;
                k++;
            }

        }
        while(i<leftLength) {
            toOrderArray[k] = left[i];
            i++;
            k++;
        }
        while(j<rightLength) {
            toOrderArray[k] = right[j];
            j++;
            k++;
        }
        return toOrderArray;

    }
}
