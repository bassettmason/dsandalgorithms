public class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("morning dave");

        int[] numlist = new int[3];
        numlist[0] = 1;
        numlist[1] = 2;
        numlist[2] = 3;

        reverse(numlist);

    }

    public static void reverse (int[] numlist) {
        for (int i = numlist.length - 1; i>= 0; i--) {
            System.out.println(numlist[i]);
        }

    }


}
