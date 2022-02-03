package week7.submission;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Exact Change

 * Link: https://open.kattis.com/problems/exactchange2 ;

 * @author Marin-Petru Hincu

 * @version 3.0, 2021-12-12

 * Method : Dynamic Programming

 * Status : Accepted

 * Runtime: 0.28 s */

import java.util.Arrays;
import java.util.Scanner;

public class ExactChange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            if (price <= 0){
                System.out.println(0 + " " + 0);
                break;
            }

            int nOfBills = scanner.nextInt();
            if (nOfBills <= 0){
                System.out.println(0 + " " + 0);
                break;
            }

            int[] bills = new int[nOfBills];
            for (int j = 0; j < nOfBills; j++) {
                bills[j] = scanner.nextInt();
            }
            int[] dp = new int[30001];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;

            for (int bill : bills) {
                for (int v = 30001 - bill - 1; v >= 0; v--) {
                    if (dp[v] < Integer.MAX_VALUE) {
                        dp[v + bill] = Math.min(dp[v + bill], dp[v] + 1);
                    }
                }
            }

            for (int j = price; j < dp.length; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    System.out.println(j + " " + dp[j]);
                    break;
                }
            }
        }
    }
}
