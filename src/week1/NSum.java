package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: N-sum

 * Link: https://open.kattis.com/problems/nsum ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-29

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.10 s */

import java.util.Scanner;

public class NSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt(), result = 0;
		
		for(int i = 0; i < amount; i++) result += scanner.nextInt();

		System.out.println(result);
	}
}
