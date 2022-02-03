package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Knapsack {

    //public static int numberOfItems = 0;
    //public static ArrayList<Integer> indices = new ArrayList<>();

    public static int knapsack(int n, int capacity, int[] weight, int[] value, int[] used, HashMap<String,Integer> memo) {
        String key = String.valueOf(n) + "," + String.valueOf(capacity);
        if (memo.containsKey(key)) return memo.get(key);
        int result;
        used[n] = 0;
        if (n == 0 | capacity == 0){
            result = 0;
        }
        else if (weight[n] > capacity) {
            used[n] = 0;
            result = knapsack(n-1,capacity,weight,value, used, memo);
        }
        else {
            int temp1 = knapsack(n-1,capacity,weight,value, used, memo);
            int temp2 = value[n] + knapsack(n-1, capacity - weight[n],weight,value, used, memo);
            result = Integer.max(temp1,temp2);
            if (result == temp2){
                used[n] = 1;
            }
        }
        memo.put(key,result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int capacity = scanner.nextInt();
            int numberOfItems = scanner.nextInt();


            int[] weight = new int[numberOfItems];
            int[] value = new int[numberOfItems];
            int[] used = new int[numberOfItems];

            for (int i = 0; i < numberOfItems; i++) {
                value[i] = scanner.nextInt();
                weight[i] = scanner.nextInt();
                used[i] = 0;
            }

            int bla = knapsack(numberOfItems-1,capacity,weight,value, used, new HashMap<>());
            //System.out.println(Arrays.toString(used));

            ArrayList<Integer> usedIndeces = new ArrayList<>();
            int usedCounter = 0;
            for (int i = 0; i < numberOfItems; i++) {
                if (used[i] == 1) {
                    usedCounter++;
                    usedIndeces.add(i);
                }
            }

            System.out.println(usedCounter);
            for (Integer usedIndece : usedIndeces) {
                System.out.print(usedIndece + " ");
            }
            System.out.println("");
            //System.out.println(usedIndeces);
        }


        //System.out.println(numberOfItems);
        //System.out.println(indices);
    }
}
