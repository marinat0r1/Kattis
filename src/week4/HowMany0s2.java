package week4;

import java.util.Scanner;

public class HowMany0s2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tcCounter = 0;
        while (tcCounter <= 15000) {
            long m = scanner.nextLong();
            long n = scanner.nextLong();
            int counter = 0;

            while (n > 999999999 & n > m) {
                n -= 1000000000;
                counter += 900000009;
            }
            while (n > 99999999 & n > m) {
                n -= 100000000;
                counter += 80000008;
            }
            while (n > 9999999 & n > m) {
                n -= 10000000;
                counter += 7000007;
            }
            while (n > 999999 & n > m) {
                n -= 1000000;
                counter += 600006;
            }
            while (n > 99999 & n > m) {
                n -= 100000;
                counter += 50005;
            }
            while (n > 9999 & n > m) {
                n -= 10000;
                counter += 4004;
            }
            while (n > 999 & n > m) {
                n -= 1000;
                counter += 303;
            }
            while (n > 99 & n > m) {
                n -= 100;
                counter += 22;
            }
            while (n > 9 & n > m) {
                n -= 10;
                counter += 2;
            }

            System.out.println(counter);
            n = 0;
            m = 0;
            counter = 0;
        }
    }
}
