package DynamicProgramming.tabulation;

import java.util.Arrays;

public class Fib {

    public static long fib(int n) {
        long[] array = new long[n+2];
        array[1] = 1;
        for (int i = 0; i < n; i++) {
            array[i+1] += array[i];
            array[i+2] += array[i];
        }
        //System.out.println(Arrays.toString(array));
        return array[n];
    }

    public static void main(String[] args) {

        System.out.println(fib(50));
    }
}
