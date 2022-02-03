package week10;

import java.util.Scanner;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Convex Polygon Area

 * Link: https://open.kattis.com/problems/convexpolygonarea ;

 * @author Marin-Petru Hincu

 * @version 3.0, 2022-01-24

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.21 s */

public class ConvexPolygonArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int reps = scanner.nextInt();

        for (int i = 0; i < reps; i++) {
            int n = scanner.nextInt() * 2;
            double[] vertices = new double[n];

            for (int j = 0; j < n; j++) {
                vertices[j] = scanner.nextInt();
            }

            double area = (vertices[n-2] * vertices[1]) - (vertices[n-1] * vertices[0]);

            for (int j = 0; j < n; j+=2) {
                if (j+3 < n) area += vertices[j] * vertices[j+3];
            }

            for (int j = 1; j < n; j+=2) {
                if (j+1 < n) area -= vertices[j] * vertices[j+1];
            }

            System.out.println(Math.abs(area / 2));
        }
    }
}
