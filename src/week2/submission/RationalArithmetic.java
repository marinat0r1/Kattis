package week2.submission;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Rational Arithmetic

 * Link: https://open.kattis.com/problems/rationalarithmetic ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-11-07

 * Method : Ad-Hoc

 * Status : Wrong Answer

 * Runtime: 0.13 s */

import java.util.Scanner;

public class RationalArithmetic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int x1, y1, x2, y2, r1=0, r2=0;
        String op;

        for (int i=0; i<amount; i++) {
             x1 = scanner.nextInt();
             y1 = scanner.nextInt();
             op = scanner.next();
             x2 = scanner.nextInt();
             y2 = scanner.nextInt();

             switch (op){
                 case "+":
                     r1 = (x1*y2) + (x2*y1);
                     r2 = y1*y2;
                     break;
                 case "-":
                     r1 = (x1*y2) - (x2*y1);
                     r2 = y1*y2;
                     break;
                 case "/":
                     r1 = y2;
                     r2 = (x1*y1) / (x2*y2);
                     break;
                 case "*":
                     r1 = (x1/y1);
                     r2 = x2*y2;
                     break;
             }
            System.out.println(r1 + "/" + r2);
        }
    }
}
