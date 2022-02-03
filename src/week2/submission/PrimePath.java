package week2.submission;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Prime Path

 * Link: https://open.kattis.com/problems/primepath ;

 * @author Marin-Petru Hincu

 * @version 2.0, 2021-11-07

 * Method : Ad-Hoc

 * Status : Run Time Error

 * Runtime: 0.25 s */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class PrimePath {

    public static boolean primeTest(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }

    public static ArrayList<Integer> splitInt(int num) {
        ArrayList<Integer> array = new ArrayList<>();
        do{
            array.add(num % 10);
            num /= 10;
        } while  (num > 0);

        Collections.reverse(array);
        return array;
    }

    public static int concatNum(ArrayList<Integer> nums) {
        return nums.get(0) * 1000 + nums.get(1) * 100 +
                nums.get(2) * 10 + nums.get(3);
    }

    public static void createCandidates( ArrayList<Integer> numSplit,
                                         LinkedList<Integer> candidates,
                                         int num) {
        for (int j=0; j<4; j++){
            for (int i=numSplit.get(j); i<10; ++i) {
                numSplit.set(j,i);
                int temp = concatNum(numSplit);
                if (primeTest(temp) && temp != num) candidates.add(temp);
            }
            numSplit = splitInt(num);
        }
    }

    public static void main(String[] args) {

         int steps = 0;
         int num = 1033;
         int dest = 8179;
         int nextPrime = 0;
         ArrayList<Integer> numSplit = splitInt(num);
         LinkedList<Integer> candidates = new LinkedList<Integer>();
         ArrayList<Integer> stepsList = new ArrayList<Integer>();

         candidates.push(num);

         do {
             num = candidates.pop();
             createCandidates(numSplit, candidates, num);
             System.out.println(candidates);
         }while (num <= dest);

        System.out.println(candidates);
    }
}
