public class ArrayReverse {
    public static void main(String[] args) {


        int[] numlist = new int[3];
        numlist[0] = 1;
        numlist[1] = 2;
        numlist[2] = 3;

        reverse(numlist);

    }

    public static int[] reverse (int[] numlist) {
        int[] newNumlist = new int[numlist.length];
        for (int i = numlist.length - 1; i>= 0; i--) {
            newNumlist[i] = numlist[i];
        }
        return newNumlist;
    }


}
