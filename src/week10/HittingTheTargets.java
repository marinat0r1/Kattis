package week10;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Hitting the Targets

 * Link: https://open.kattis.com/problems/hittingtargets ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2022-01-24

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.13 s */

import java.util.ArrayList;
import java.util.Scanner;

public class HittingTheTargets {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            ArrayList<Integer> rectangles = new ArrayList<>();
            ArrayList<Integer> circles = new ArrayList<>();

            int targets = scan.nextInt();

            for (int i = 0; i < targets; i++) {
                String str = scan.next();

                if (str.equals("rectangle")) {
                    for (int z = 0; z < 4; z++) {
                        rectangles.add(scan.nextInt());
                    }

                }
                if (str.equals("circle")) {
                    for (int z = 0; z < 3; z++) {
                        circles.add(scan.nextInt());
                    }

                }
            }

            int reps = scan.nextInt();

            for (int i = 0; i < reps; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();

                int shots = 0;

                for (int j = 0; j < rectangles.size(); j += 4) {
                    if (x >= rectangles.get(j) &&
                            y >= rectangles.get(j+1) &&
                            x <= rectangles.get(j+2) &&
                            y <= rectangles.get(j+3)) {
                        shots++;
                    }

                }

                for (int j = 0; j < circles.size(); j += 3) {
                    if (Math.sqrt( (x - circles.get(j))
                            * (x - circles.get(j))
                            + (y - circles.get(j + 1))
                            * (y - circles.get(j + 1)) )
                            <= circles.get(j + 2)) {
                        shots++;
                    }
                }

                System.out.println(shots);
            }
        }
}
