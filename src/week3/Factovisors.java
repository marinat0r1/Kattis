package week3;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Factovisors

 * Link: https://open.kattis.com/problems/factovisors ;

 * @author Marin-Petru Hincu

 * @version 2.0, 2021-11-19

 * Method : Ad-Hoc

 * Status : Memory Limit Exceeded

 * Runtime: 0.65 s */

import java.util.Scanner;

public class Factovisors {
	
	public static long fac(long n) {
		if (n == 0) return 1;
		return n * fac(n-1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			long n = scanner.nextLong();
			int m = scanner.nextInt();
			
			long nFac = fac(n);
			if (nFac % m == 0 & nFac != 0){
				System.out.println(m + " divides " + n + "!");
			}
			else {
				System.out.println(m + " does not divide " + n + "!");
			}
		}
	}
}
