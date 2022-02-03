package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Magic Trick

 * Link: https://open.kattis.com/problems/magictrick ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-30

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.10 s */

import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		char[] c = s.toCharArray();
		boolean b = true;
		
		for(int i = 0; i < c.length; i++) {
			char temp = c[i];
			for(int j = i + 1; j < c.length; j++) {
				if(c[i] == c[j]) {
					b = false;
					break;
				}
			}
		}
		if(b) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}
