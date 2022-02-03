package week3;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Mirror Images

 * Link: https://open.kattis.com/problems/mirror ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-11-13

 * Method : Ad-Hoc

 * Status : Run Time Error

 * Runtime: 0.13 s */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MirrorImages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        for (int i=0;i<testCases;i++){
            int rows = scanner.nextInt();
            int columns = scanner.nextInt();
            ArrayList<String> chars = new ArrayList<String>();

            for (int j = 0; j < rows * columns; j++) {
                chars.add(scanner.next());
            }
            Collections.reverse(chars);
            System.out.println("Test " + (i+1));
            for (int j = 0; j < rows * columns; j++) {
                if ((j+1)%columns == 0 & j != 0){
                    System.out.println(chars.get(j));
                }else {
                    System.out.print(chars.get(j));
                }
            }
        }
    }
}
