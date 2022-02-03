package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Two-sum

 * Link: https://open.kattis.com/problems/twosum ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-26

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.10 s */

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = new int[2];

        for (int i = 0; i < 2; i++) numbers[i] = scanner.nextInt();

        System.out.println(numbers[0] + numbers[1]);
    }
}
