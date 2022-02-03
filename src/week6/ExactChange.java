package week6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ExactChange {

    public static HashMap<Integer,ArrayList<Integer>> results = new HashMap<>();

    public static ArrayList<Integer> remainderResult;

    public static ArrayList<Integer> computeChange(int targetSum, ArrayList<Integer> numbers, HashMap<Integer,ArrayList<Integer>> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);

        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) {
            results.put(targetSum,remainderResult);
            return null;
        }


        for (int i : numbers) {
            int remainder = targetSum - i;
            remainderResult = computeChange(remainder,numbers, memo);
            if (remainderResult != null) {
                remainderResult.add(i);
                memo.put(targetSum,remainderResult);
                return remainderResult;
            }
        }
        memo.put(targetSum,null);
        return null;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int targetAmount = scanner.nextInt();
            int billsAmount = scanner.nextInt();
            ArrayList<Integer> bills = new ArrayList<>();
            for (int j = 0; j < billsAmount; j++) {
                bills.add(scanner.nextInt());
            }
            System.out.println(computeChange(targetAmount, bills, new HashMap<>()));
            System.out.println(results);
        }

    }

    }
