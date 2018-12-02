public class ArrayShift {


    public static int[] insertShiftArray(int[] array, int v) {
        int[] returnArray = new int[array.length + 1] ;
        for (int i = 0; i < returnArray.length; i++) {
            if (i == returnArray.length/2){
                returnArray[i] = v;

            }
            if (i < returnArray.length/2) {
                returnArray[i] = array[i];

            }
            if (i > returnArray.length/2) {
                returnArray[i] = array[i-1];

            }
        }

        return (returnArray);
    }
}




