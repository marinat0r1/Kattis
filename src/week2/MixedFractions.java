package week2;

import java.util.Scanner;

public class MixedFractions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = -1, denominator = -1;

        while (true){
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();
            if (numerator == 0 & denominator == 0) break;
            if (numerator < denominator) {
                System.out.println("0" + " " + numerator + " / " + denominator);
            } else {
                int n = numerator / denominator;
                int properFraction = numerator % denominator;
                System.out.println(n + " " + properFraction + " / " + denominator);
            }
        }
    }
}
