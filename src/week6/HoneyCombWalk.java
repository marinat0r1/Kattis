package week6;

import java.util.Scanner;

public class HoneyCombWalk {

    static int fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }

    static int nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            int r = scanner.nextInt();
            System.out.println(nPr(6,r-1));
        }
    }

}
