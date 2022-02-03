package week1;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Solving for Carrots

 * Link: https://open.kattis.com/problems/carrots ;

 * @author Marin-Petru Hincu

 * @version 1.0, 2021-10-26

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.10 s */

import java.util.ArrayList;
import java.util.Scanner;

public class SolvingForCarrots {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        ArrayList<Object> allData = new ArrayList<>();
        
        allData.add(scanner.nextInt());
        allData.add(scanner.nextInt());
        allData.add(scanner.nextLine());
        allData.add(scanner.nextLine());
        
        System.out.println(allData.get(1));

	}

}
