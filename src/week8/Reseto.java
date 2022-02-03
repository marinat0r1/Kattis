package week8;

import java.util.ArrayList;
import java.util.Scanner;

public class Reseto {

        public static ArrayList<Integer> nonPrimes = new ArrayList<>();

        public static void sieveOfEratosthenes(int n) {
            boolean[] prime = new boolean[n + 1];
            for (int i = 0; i <= n; i++) prime[i] = true;

            for (int p = 2; p * p <= n; p++) {
                if (prime[p]) {
                    for (int i = p * p; i <= n; i += p) {
                        prime[i] = false;
                    }
                } else {
                    nonPrimes.add(p);
                }
            }

            for (int i = 2; i <= n; i++) {
                //if (prime[i]) nonPrimes.add(i);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt(), k = scanner.nextInt();
            sieveOfEratosthenes(n);

            System.out.println(nonPrimes);
            //System.out.println(nonPrimes.get(k-1));
        }

}
