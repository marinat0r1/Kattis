package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LIS {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) { array[i] = scanner.nextInt(); }

            int[] temp = new int[array.length];
            Arrays.fill(temp,1);

            int[] prev = new int[array.length];
            Arrays.fill(prev, -1);

            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j <= i; j++) {
                    if (array[i] > array[j] & temp[i] < temp[j] + 1) {
                        temp[i] = temp[j] + 1;
                        prev[i] = j;
                    }
                }
            }

            int result = temp[0], pos = 0;
            for (int i = 1; i < temp.length; i++) {
                if (temp[i] > result) {
                    result = temp[i];
                    pos = i;
                }
            }

            ArrayList<Integer> seq = new ArrayList<>();
            while (pos != -1) {
                seq.add(pos);
                pos = prev[pos];
            }
            Collections.reverse(seq);

            System.out.println(result);
            for (int num : seq) System.out.print(num + " ");
            System.out.println("");

        }
    }
}
