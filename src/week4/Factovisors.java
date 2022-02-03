package week4;

import java.util.Scanner;

public class Factovisors {
	
	public static long fac(long n) {
		long product = 1;
		for (long j=1; j<=n; j++ )
			product *= j;
		return product;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n=0;
		int m=0;
		try {
			while(scanner.hasNextLong()) {
				n = scanner.nextLong();
				m = scanner.nextInt();

				long nFac = fac(n);
				if (nFac % m == 0 & nFac != 0) System.out.println(m + " divides " + n + "!");
				else { System.out.println(m + " does not divide " + n + "!"); }
			}
		} catch (RuntimeException e) {
			System.out.println(m + " does not divide " + n + "!");
		}


	}

}
