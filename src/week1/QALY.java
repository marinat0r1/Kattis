package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Quality-Adjusted Life-Year

 * Link: https://open.kattis.com/problems/qaly ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-26

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.15 s */

import java.util.ArrayList;
import java.util.Scanner;

public class QALY {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> allData = new ArrayList<>();

        allData.add(scanner.nextDouble());

        for (int i = 0; i < allData.get(0) * 2; i++) {
            allData.add(scanner.nextDouble());
        }

        double qaly = 0;
       
        for(int i = 1; i < allData.get(0) * 2; i += 2) {
            qaly += allData.get(i) * allData.get(i + 1);
        }

        System.out.println(qaly);
	}

}
