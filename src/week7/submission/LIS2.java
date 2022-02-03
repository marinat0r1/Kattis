package week7.submission;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Longest Increasing Subsequence

 * Link: https://open.kattis.com/problems/longincsubseq ;

 * @author Marin-Petru Hincu

 * @version 4.0, 2021-12-13

 * Method : Dynamic Programming

 * Status : Accepted

 * Runtime: 1.42 s */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LIS2 {

    public static int[] v = new int[100100],
                    tail = new int[100100],
                    pre = new int[100100];
    public static Scanner scanner = new Scanner(System.in);

    public static int ceilIndex(int l, int r, int key) {
        while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (v[tail[m]] >= key) r = m;
            else l = m;
        }
        return r;
    }

    public static boolean lis(int n) {
        if (n == 0) return true;
        Arrays.fill(tail,0,n,0);
        Arrays.fill(pre,0,n,-1);
        int length = 1;

        v[0] = scanner.nextInt();
        tail[0] = 0;
        for (int i = 1; i <= n-1; ++i) {
            v[i] = scanner.nextInt();
            if (v[i] <= v[tail[0]]) tail[0] = i;
            else if (v[i] > v[tail[length-1]]) {
                pre[i] = tail[length-1];
                tail[length] = i;
                length++;
            } else {
                int m = ceilIndex(-1,length-1,v[i]);
                pre[i] = tail[m-1];
                tail[m] = i;
            }
        }
        System.out.println(length);
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = tail[length-1]; i >= 0; i = pre[i]) {
            out.add(i);
        }

        for (int i = out.size()-1; i >= 0; --i) {
            if (i < out.size()-1) System.out.print(" ");
            System.out.print(out.get(i));
        }
        System.out.println("");
        return true;
    }

    public static void main(String[] args) {

        int n = 0;

        while (scanner.hasNext()) {
            n = scanner.nextInt();
            lis(n);
        }
    }
}
