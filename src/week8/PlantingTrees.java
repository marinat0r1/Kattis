package week8;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Planting Trees

 * Link: https://open.kattis.com/problems/plantingtrees ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-12-17

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.53 s */

import java.util.Arrays;
import java.util.Scanner;

public class PlantingTrees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), result = 0;

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        Arrays.sort(a);
        for (int i = a.length-1, j = 0; i >= 0; i--, j++) {
            if (result < a[i] + j) result = a[i] + j;
        }

        System.out.println(result + 2);
    }
}
