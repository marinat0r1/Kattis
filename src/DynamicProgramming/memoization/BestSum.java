package DynamicProgramming.memoization;

import java.util.ArrayList;
import java.util.Arrays;

public class BestSum {

    public static ArrayList<Integer> bestSum(int targetSum, ArrayList<Integer> numbers) {
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : numbers) {
            int remainder = targetSum - i;
            ArrayList<Integer> remainderResult = bestSum(remainder,numbers);
            if (remainderResult != null) {
                ArrayList<Integer> temp = new ArrayList<>(remainderResult);
                temp.add(i);
                //System.out.println(temp);
                if (result.size() > temp.size()) {
                    result.clear();
                    result.addAll(temp);
                }
            }
        }
        //System.out.println(result);
        return result;
    }

    public static void main(String[] args) {

        System.out.println(bestSum(7,new ArrayList<>(Arrays.asList(2,3))));
        System.out.println(bestSum(7,new ArrayList<>(Arrays.asList(5,3,4,7))));
        System.out.println(bestSum(7,new ArrayList<>(Arrays.asList(2,4))));
        System.out.println(bestSum(8,new ArrayList<>(Arrays.asList(2,3,5))));
        System.out.println(bestSum(300,new ArrayList<>(Arrays.asList(7,14))));

    }
}
