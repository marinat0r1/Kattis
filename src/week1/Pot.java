package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Pot

 * Link: https://open.kattis.com/problems/pot ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-26

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.10 s */

import java.util.Scanner;

public class Pot {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numberOfInts = scanner.nextInt();
		
		int x = 0, firstPart, secondPart;
		String temp = scanner.nextLine();
		
		for(int i = 0; i < numberOfInts; i++) {
			temp = scanner.nextLine();
			firstPart = Integer.parseInt(temp.substring(0, temp.length() - 1));
			secondPart = Integer.parseInt(temp.substring(temp.length() - 1));
			x += Math.pow(firstPart, secondPart);
		}
		System.out.println(x);
	}
}
