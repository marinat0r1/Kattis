package week4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Factovisors2 {
    public static long[] primfaktorzerlegung(long n){
        int maxFactors = (int) Math.ceil(Math.log10(n)/Math.log10(2));
        long[] tmp = new long[maxFactors];
        int factorsN = 0;
        for (long j = 2; j <= n; j++ ) {
            if (n % j == 0) {
                tmp[factorsN++] = j;
                n = n/j;
                j = 1;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(primfaktorzerlegung(9)));
    }

}
