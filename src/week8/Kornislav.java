package week8;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Kornislav

 * Link: https://open.kattis.com/problems/kornislav ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-12-14

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.10 s */

import java.util.Arrays;
import java.util.Scanner;

public class Kornislav {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) a[i] = scanner.nextInt();
        Arrays.sort(a);
        System.out.println(a[0] * a[2]);
    }
}
