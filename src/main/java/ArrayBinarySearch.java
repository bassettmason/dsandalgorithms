public class ArrayBinarySearch {


    public static int searchd(int[] array, int t){

        int n = array.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r)/2;
            if (array[m]<t) {
                l= m+1;

            }else if (array[m]> t){
                r = m - 1;
            }else return(m);

        }
        return(-1);
    }
}



