package DynamicProgramming.memoization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HowSum {

    public static ArrayList<Integer> howSum(int targetSum, ArrayList<Integer> numbers) {
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;

        for (int i : numbers) {
            int remainder = targetSum - i;
            ArrayList<Integer> remainderResult = howSum(remainder,numbers);
            if (remainderResult != null) {
                remainderResult.add(i);
                return remainderResult;
            }
        }
        return null;
    }

    public static ArrayList<Integer> dynamicHowSum(int targetSum, ArrayList<Integer> numbers, HashMap<Integer,ArrayList<Integer>> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);

        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;

        for (int i : numbers) {
            int remainder = targetSum - i;
            ArrayList<Integer> remainderResult = dynamicHowSum(remainder,numbers, memo);
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

        System.out.println(dynamicHowSum(7,new ArrayList<>(Arrays.asList(2,3)), new HashMap<>()));
        System.out.println(dynamicHowSum(7,new ArrayList<>(Arrays.asList(5,3,4,7)), new HashMap<>()));
        System.out.println(dynamicHowSum(7,new ArrayList<>(Arrays.asList(2,4)), new HashMap<>()));
        System.out.println(dynamicHowSum(8,new ArrayList<>(Arrays.asList(2,3,5)), new HashMap<>()));
        System.out.println(dynamicHowSum(300,new ArrayList<>(Arrays.asList(7,14)), new HashMap<>()));

        System.out.println(howSum(7,new ArrayList<>(Arrays.asList(2,3))));
        System.out.println(howSum(7,new ArrayList<>(Arrays.asList(5,3,4,7))));
        System.out.println(howSum(7,new ArrayList<>(Arrays.asList(2,4))));
        System.out.println(howSum(8,new ArrayList<>(Arrays.asList(2,3,5))));
        System.out.println(howSum(300,new ArrayList<>(Arrays.asList(7,14))));

    }
}
