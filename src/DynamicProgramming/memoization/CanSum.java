package DynamicProgramming.memoization;

import java.util.HashMap;

public class CanSum {

    public static boolean canSum(int targetSum, int [] nums, HashMap<Integer,Boolean> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum < 0) return false;
        if (targetSum == 0) return true;
        for (int i : nums) {
            int remainder = targetSum - i;
            memo.put(remainder,canSum(remainder,nums,memo));
            if (memo.get(remainder)) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(canSum(7, new int[]{5, 3, 4, 7}, new HashMap<>()));
        System.out.println(canSum(7, new int[]{2,4,6}, new HashMap<>()));
        System.out.println(canSum(22, new int[]{7,5,9,33}, new HashMap<>()));
        System.out.println(canSum(300, new int[]{7,14}, new HashMap<>()));

    }
}
