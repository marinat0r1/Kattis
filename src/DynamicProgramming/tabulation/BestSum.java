package DynamicProgramming.tabulation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BestSum {

    public static ArrayList<Integer> bestSum(int targetSum, ArrayList<Integer> numbers) {
        List<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>(Collections.<ArrayList<Integer>>nCopies(targetSum + 1, null));
        results.set(0,new ArrayList<>());

        for (int i = 0; i <= targetSum; i++) {
            if (results.get(i) != null) {
                for (int n : numbers) {
                    if (i + n <= targetSum) {
                        if (results.get(i + n) != null) {
                            if(results.get(i + n).size() > results.get(i).size() + 1) {
                                ArrayList<Integer> temp = new ArrayList<>(results.get(i));
                                temp.add(n);
                                results.set(i+n, temp);
                                }
                        } else {
                            ArrayList<Integer> temp = new ArrayList<>(results.get(i));
                            temp.add(n);
                            results.set(i+n, temp);
                        }
                    }
                }
            }
        }
        //System.out.println(results);
        return results.get(targetSum);
    }

    public static void main(String[] args) {

        System.out.println(bestSum(7,new ArrayList<>(Arrays.asList(2,3))));
        System.out.println(bestSum(7,new ArrayList<>(Arrays.asList(5,3,4,7))));
        System.out.println(bestSum(7,new ArrayList<>(Arrays.asList(2,4))));
        System.out.println(bestSum(8,new ArrayList<>(Arrays.asList(2,3,5))));
        System.out.println(bestSum(300,new ArrayList<>(Arrays.asList(7,14))));
        System.out.println(bestSum(100,new ArrayList<>(Arrays.asList(7,14,25,30,10))));
    }
}
