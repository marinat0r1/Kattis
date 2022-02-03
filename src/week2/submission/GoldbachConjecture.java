package week2.submission;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Goldbach's Conjecture

 * Link: https://open.kattis.com/problems/goldbach2 ;

 * @author Marin-Petru Hincu

 * @version 2.0, 2021-11-07

 * Method : Ad-Hoc

 * Status : Time Limit Exceeded

 * Runtime: > 1.00 s */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GoldbachConjecture {

    public static boolean isPrime(int number) {
        return number > 0
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt(), n = 0;

        for (int i = 0; i < amount; i++) {
            n = scanner.nextInt();
            ArrayList<Integer> primes = new ArrayList<>();
            ArrayList<String> result = new ArrayList<>();
            for(int l = 1; l < n; l++) {
                if (isPrime(l)) primes.add(l);
            }
            for (int j = 1; j < primes.size()-1; j++) {
                for (int k = j; k< primes.size();k++) {
                    if (primes.get(j) + primes.get(k) == n){
                        result.add(primes.get(j) + "+" + primes.get(k));
                    }
                }
            }
            System.out.println(n + " has " + result.size()
                                + " representation(s)");
            for (String j : result) {
                System.out.println(j);
            }
        }
    }
}
