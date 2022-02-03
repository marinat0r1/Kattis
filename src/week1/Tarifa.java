package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Tarifa

 * Link: https://open.kattis.com/problems/tarifa ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-26

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.11 s */

import java.util.ArrayList;
import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> allData = new ArrayList<>();

        allData.add(scanner.nextInt());
        allData.add(scanner.nextInt());
        
        for(int i = 0; i < allData.get(1); i++){
                allData.add(scanner.nextInt());
        }

        int totalMegabytes = allData.get(0) * allData.get(1);
        int usedMegabytes = 0;

        for (int i = 2; i < allData.get(1) + 2; i++){
                usedMegabytes += allData.get(i);
        }

        int leftMegabytes = totalMegabytes - usedMegabytes;

        System.out.println(leftMegabytes + allData.get(0));
	}
}
