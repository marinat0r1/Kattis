package week7.submission;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Ants

 * Link: https://open.kattis.com/problems/ants ;

 * @author Marin-Petru Hincu

 * @version 3.0, 2021-12-12

 * Method : Ad- Hoc

 * Status : Accepted

 * Runtime: 0.82 s */

import java.util.Arrays;
import java.util.Scanner;

public class Ants3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int len = sc.nextInt(), n = sc.nextInt(), min = 0;
            int[] ants = new int[n];
            for (int i = 0; i < n; i++) {
                ants[i] = sc.nextInt();
                min = Math.max(Math.min(ants[i], len - ants[i]), min);
            }
            Arrays.sort(ants);
            int[] max = {ants[0], ants[n - 1], len - ants[0],
                        len - ants[n - 1]};

            Arrays.sort(max);
            System.out.println(min + " " + max[3]);
         }
    }
}
