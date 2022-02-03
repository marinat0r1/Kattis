package week6;

import java.util.Scanner;

public class DigitSum {

    public static int digitize(int n) {
        int result = 0;
        while (n > 0) {
            result += n%10;
            n /= 10;
        }
        return result;
    }

    public static int digitSum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += digitize(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println(digitSum(scanner.nextInt(),scanner.nextInt()));
        }
    }
}
