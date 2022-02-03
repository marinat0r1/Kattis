package week7;

import java.util.Arrays;
import java.util.Scanner;

public class ExactChange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            if (price <= 0){
                System.out.println(0 + " " + 0);
                break;
            }

            int nOfBills = scanner.nextInt();
            if (nOfBills <= 0){
                System.out.println(0 + " " + 0);
                break;
            }

            int[] bills = new int[nOfBills];
            for (int j = 0; j < nOfBills; j++) { bills[j] = scanner.nextInt(); }
            int[] coinTable = new int[30001];
            Arrays.fill(coinTable, Integer.MAX_VALUE);

            coinTable[0] = 0;
            //for (int bill : bills) coinTable[bill] = 1;

            for (int bill : bills) {
                for (int v = 30001 - bill - 1; v >= 0; v--) {
                    if (coinTable[v] < Integer.MAX_VALUE) coinTable[v + bill] = Math.min(coinTable[v + bill], coinTable[v] + 1);
                }
            }

/*            for (int j = 0; j < coinTable.length; j++) {
                if (coinTable[j] < Integer.MAX_VALUE) {
                    for (int bill : bills) {
                        if (j + bill < coinTable.length) {
                            coinTable[j + bill] = Math.min(coinTable[j+bill], coinTable[j] + 1);
                        }
                    }
                }
            }*/

            for (int j = price; j < coinTable.length; j++) {
                if (coinTable[j] != Integer.MAX_VALUE) {
                    System.out.println(j + " " + coinTable[j]);
                    break;
                }
            }
        }
    }
}
