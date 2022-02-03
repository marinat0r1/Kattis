package week2.submission;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: How many 0's?

 * Link: https://open.kattis.com/problems/howmanyzeros ;

 * @author Marin-Petru Hincu

 * @version 3.0, 2021-11-20

 * Method : Ad-Hoc

 * Status : Time Limit Exceeded

 * Runtime: > 1.00 s */

import java.util.Scanner;

public class HowMany0s {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

        long n=0, m=0, counter=0, tcCounter=0, tempI = 0;

        Scanner scanner = new Scanner(System.in);
        String temp;
        while(tcCounter <= 15000){
            n = scanner.nextLong();
            m = scanner.nextLong();
            if (m < 0 | n > m) break;
            for (long i=n; i<=m; i++) {
                tempI = i;
                while (tempI >= 0){
                    if (tempI % 10 == 0 | tempI ==0){
                        counter++;
                    }
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
        System.out.println(Integer.MAX_VALUE);
    }
}
