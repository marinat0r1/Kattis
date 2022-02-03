package week6.submission;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Radio Commercials

 * Link: https://open.kattis.com/problems/commercials ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-12-11

 * Method : Ad- Hoc

 * Status : Accepted

 * Runtime: 0.48 s */

import java.util.Scanner;

public class RadioCommercials {

    public static int compute(int[] arr) {
        int totalMax = arr[0], tempMax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (tempMax < 0){ tempMax = arr[i]; }
            else tempMax += arr[i];

            if (tempMax >= totalMax){ totalMax = tempMax; }
        }
        return totalMax;
    }

    public static void main (String[] args)  {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int p = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) { arr[i] = (scan.nextInt()- p); }

        System.out.println(compute(arr));
    }
}
