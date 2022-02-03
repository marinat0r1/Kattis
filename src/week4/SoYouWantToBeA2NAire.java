package week4;

import java.util.Random;
import java.util.Scanner;

public class SoYouWantToBeA2NAire {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<=300;i++) {
            int n = scanner.nextInt();
            double t = scanner.nextDouble(), price = 1, p = 0;
            Random random;
            if (n == 0 & t == 0) break;
            do {
                price *= 2;
                p = (Math.random() * (1 - t)) + t;
            } while (p != 0);

        }
    }
}
