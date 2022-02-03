package week7;

import java.util.ArrayList;
import java.util.Scanner;

public class Knapsack2 {

    public static int[] stt = new int[2010], value = new int[2010], weight = new int[2010];
    public static int[][] K = new int[2010][2010];

    public static boolean tmp (int a, int b) {
        if (weight[a] < weight[b]) return true;
        return false;
    }

    public static void knap(int W, int n) {
        for (int i = 0; i <= n; ++i) {
            for (int w = 0; w <= W; ++w) {
                if (i == 0 | w == 0) K[i][w] = 0;
                else if(weight[stt[i-1]] <= w) K[i][w] = Math.max(value[stt[i-1]] + K[i-1][w-weight[stt[i-1]]], K[i-1][w]);
                else K[i][w] = K[i-1][w];
            }
        }
        int sum = 0, i = n, w = W;
        ArrayList<Integer> index = new ArrayList<>();
        while (i > 0 & w > 0 & K[i][w] != 0) {
            if (K[i-1][w] < K[i][w]) {
                ++sum;
                index.add(stt[i-1]);
                w = weight[stt[i-1]]; // ?
            }
            --i;
        }
        System.out.println(sum);
        for (int j = 0 ; j < index.size(); ++j) {
            if (j > 0) System.out.print(" ");
            System.out.println(index.get(j));
        }
        if (index.size()!= 0) System.out.println("");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int capacity = scanner.nextInt();
            int numberOfItems = scanner.nextInt();


            for (int i = 0; i < numberOfItems; i++) {
                value[i] = scanner.nextInt();
                weight[i] = scanner.nextInt();
            }

            knap(capacity,numberOfItems);
        }
    }

}
