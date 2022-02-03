package Additional;

import java.util.Arrays;
import java.util.Scanner;

public class Pet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int ind = 0, val = 0;
        for (int i = 0; i < 5; i++) for (int j = 0; j < 4; j++) a[i] += scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            if (a[i] > val) {
                val = a[i];
                ind = i;
            }
        }
        System.out.println((ind + 1) + " " + val);
    }
}
