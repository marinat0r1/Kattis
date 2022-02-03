package DynamicProgramming.tabulation;

import java.util.Arrays;

public class GridTraveler {

    public static long gridTraveler(int n, int m) {

        if (n == 0 | m == 0) return 0;

        long[][] array = new long[n+1][m+1];
        array[1][1] = 1;

        for (int  i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j + 1 <= m) array[i][j+1] += array[i][j];
                if (i + 1 <= n)array[i+1][j] += array[i][j];
            }
        }

        //System.out.println(Arrays.deepToString(array));
        return array[n][m];
    }

    public static void main(String[] args) {

        System.out.println(gridTraveler(0,1));
        System.out.println(gridTraveler(1,1));
        System.out.println(gridTraveler(3,2));
        System.out.println(gridTraveler(3,3));
        System.out.println(gridTraveler(18,18));
    }
}
