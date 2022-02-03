package week2;

import java.util.Scanner;

public class HowMany0s {
    public static void main(String[] args) {
        final int MAX_TEST_CASES = 15000;
        long n=0, m=0, counter=0, tcCounter=0, tempI = 0;

        Scanner scanner = new Scanner(System.in);
        String temp;
        while(tcCounter <= MAX_TEST_CASES){
            n = scanner.nextLong();
            m = scanner.nextLong();
            if (m < 0 | n > m) break;
            for (long i=n; i<=m; i++) {
                tempI = i;
                while (tempI >= 0){
                    if (tempI % 10 == 0 | tempI ==0) counter++;
                    tempI /= 10;
                    if (tempI == 0) break;
                }
            }
            System.out.println(counter);
            counter = 0;
            n = 0;
            m = 0;
            tcCounter++;
        }
    }
}
