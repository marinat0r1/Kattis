package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Planina

 * Link: https://open.kattis.com/problems/planina ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-29

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.10 s */

import java.util.Scanner;

public class Planina {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int temp = (int) Math.pow(2, number) + 1;
		int result = temp * temp;
		
		System.out.println(result);

	}

}
