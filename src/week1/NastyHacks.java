package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Nasty Hacks

 * Link: https://open.kattis.com/problems/nastyhacks ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-30

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.12 s */

import java.util.Scanner;

public class NastyHacks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();

		for(int i = 0; i < amount; i++) {
			int r = scanner.nextInt();
			int e = scanner.nextInt();
			int c = scanner.nextInt();
			if(r + c < e) {
				System.out.println("advertise");
			}else if(r + c == e) {
				System.out.println("does not matter");
			}else {
				System.out.println("do not advertise");
			}
		}
	}
}
