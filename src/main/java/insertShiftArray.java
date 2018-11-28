public class insertShiftArray {
    public static void main(String[] args) {
        System.out.println("hello mark");
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;

        int v = 5;


        System.out.println(java.util.Arrays.toString(insertShift(array, v)));

    }

    public static int[] insertShift (int[]array, int v) {
        int[] returnArray = new int[array.length+1];
        int index = array.length/2+1;

        for (int i = 0; i>returnArray.length+1; i++) {
            if (i == index)
                returnArray[i] = v;

            else returnArray[i] = array[i];


        }





        return returnArray;
   }
}
