package week2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.Math.pow;

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
            ArrayList<Integer> primes = new ArrayList<Integer>();
            ArrayList<String> result = new ArrayList<>();
            for(int l = 1; l < n; l++) {
                if (isPrime(l)) primes.add(l);
            }
            for (int j = 1; j < primes.size()-1; j++) {
                for (int k = j; k< primes.size(); k++) {
                    if (primes.get(j) + primes.get(k) == n) result.add(primes.get(j) + "+" + primes.get(k));
                }
            }
            System.out.println(n + " has " + result.size() + " representation(s)");
            for (String j : result) {
                System.out.println(j);
            }
        }
    }
}
