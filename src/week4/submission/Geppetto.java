package week4.submission;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Geppetto

 * Link: https://open.kattis.com/problems/geppetto ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-11-22

 * Method : Backtracking

 * Status : Accepted

 * Runtime: 0.42 s */

import java.util.HashSet;
import java.util.Scanner;

public class Geppetto {

    public static boolean[][] bl;

    public static int backtrack(int n, HashSet<Integer> set) {
        if (n == 0) return 1;

        int count = 0;
        boolean allowed = true;
        count = backtrack(n-1,set);
        for (int i :set) {
            if (bl[i][n]) {
                allowed = false;
                break;
            }
        }
        if (allowed) {
            set.add(n);
            count += backtrack(n-1,set);
            set.remove(n);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        bl = new boolean[n+1][n+1];
        for (int i=0; i<m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            bl[x][y] = true;
            bl[y][x] = true;
        }

        System.out.println(backtrack(n,new HashSet<Integer>()));
    }
}
