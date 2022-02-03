package week4.submission;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: How Many Digits?

 * Link: https://open.kattis.com/problems/howmanydigits ;

 * @author Marin-Petru Hincu

 * @version 2.0, 2021-11-26

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.59 s */

import java.util.Scanner;

public class HowManyDigits {

    public static double nDigits(double n) {
        if (n==0 | n==1) return 1;
        return Math.ceil((Math.log(2*n)/2
                    + Math.log(n)/2
                    + n*Math.log(n)-n)/(Math.log(10)));
    }

    public static double nDigits2(double n) {
        if (n==0 | n==1) return 1;
        return Math.ceil(Math.log10(2*Math.PI*n)
                        /2+n*(Math.log10(n/Math.E)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (scanner.hasNext() && counter <= 10000) {
            double n = scanner.nextDouble();
            System.out.println((int) nDigits2(n));
            counter++;
        }
    }
}
