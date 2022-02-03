package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Jumbo Javelin

 * Link: https://open.kattis.com/problems/jumbojavelin ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-30

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.11 s */

import java.util.Scanner;

public class JumboJavelin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int jJLength = 0;
		
		for(int i = 0; i < amount; i++) jJLength += scanner.nextInt();

		System.out.println(jJLength - amount + 1);
	}
}
