package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Triangle Area

 * Link: https://open.kattis.com/problems/triarea ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-26

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.10 s */

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] numbers = new double[2];

        for (int i=0; i < 2; i++) numbers[i] = scanner.nextInt();

        System.out.println((numbers[0] * numbers[1]) / 2);
    }

}
