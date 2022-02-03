package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Take Two Stones

 * Link: https://open.kattis.com/problems/twostones ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-26

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.10 s */

import java.util.Scanner;

public class TakeTwoStones {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Bob");
		}else {
			System.out.println("Alice");
		}
	}

}
