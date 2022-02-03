package week10;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Billiard

 * Link: https://open.kattis.com/problems/billiard ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2022-01-24

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.16 s */

import java.util.Scanner;

public class Billiard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt(),
                height = sc.nextInt(),
                s = sc.nextInt(),
                bouncesOffVert = sc.nextInt(),
                bouncesOffHor = sc.nextInt();

        while (bouncesOffHor > 0 && bouncesOffVert > 0) {
            double angle, totalD;
            angle = Math.atan((bouncesOffHor * 1.0 / width) /
                    (bouncesOffVert * 1.0 / height));
            double x = height * bouncesOffHor,
                    y = width * bouncesOffVert;
            totalD = Math.sqrt((x * x) + (y * y));
            System.out.printf("%.2f %.2f%n",
                    (angle * 180 / Math.PI), (totalD / s));
            width = sc.nextInt();
            height = sc.nextInt();
            s = sc.nextInt();
            bouncesOffVert = sc.nextInt();
            bouncesOffHor = sc.nextInt();
        }
    }
}
