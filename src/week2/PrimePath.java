package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
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

        if (!flag) return true;

        return false;
    }

    public static ArrayList<Integer> splitInt(int num) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            array.add(num % 10);
            num /= 10;
        } while  (num > 0);

        Collections.reverse(array);
        return array;
    }

    public static int concatNum(ArrayList<Integer> nums) {
        return nums.get(0) * 1000 + nums.get(1) * 100 + nums.get(2) * 10 + nums.get(3);
    }

    public static void createCandidates( ArrayList<Integer> numSplit, LinkedList<Integer> candidates, int num) {
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
         int num = 1733;
         int dest = 8179;
         int nextPrime = 0;
         ArrayList<Integer> numSplit = splitInt(num);
         LinkedList<Integer> candidates = new LinkedList<Integer>();
         ArrayList<Integer> stepsList = new ArrayList<Integer>();

         candidates.push(num);

        System.out.println(candidates);
         do {
             LinkedList<Integer> temp = new LinkedList<Integer>();
             num = candidates.pop();
             createCandidates(numSplit, temp, num);
             System.out.println(temp);
             candidates.push(temp.pop());
         }while (num <= dest);


        System.out.println(candidates);


    }

}

// 1033 -> 8179