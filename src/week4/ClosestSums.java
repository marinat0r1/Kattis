package week4;

import javafx.util.Pair;

import java.util.*;

public class ClosestSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            ArrayList<Integer> ints = new ArrayList<>();
            for (int i=0;i<n;i++) { ints.add(scanner.nextInt()); }
            int m = scanner.nextInt();
            ArrayList<Integer> queries = new ArrayList<>();
            for (int i=0;i<m;i++) { queries.add(scanner.nextInt()); }
            ArrayList<Integer> sums = new ArrayList<>();
            for (int i=0;i<ints.size()-1;i++) {
                for (int j=i+1;j<ints.size();j++) {
                    sums.add(ints.get(i) + ints.get(j));
                }
            }
            ArrayList<Integer> candidates = new ArrayList<>();
            for (int i=0;i<m;i++) {
                int newSum = Integer.MAX_VALUE;
                int newSumC = Integer.MAX_VALUE;
                for (int j=0;j<ints.size();j++) {
                   if (newSum > queries.get(i) - sums.get(j)) {
                       newSumC = sums.get(j);
                       newSum = queries.get(i) - sums.get(j);

                   }
                }
                System.out.println(newSumC);
                candidates.add(newSumC);
            }
            System.out.println(ints);
            System.out.println(queries);
            System.out.println(sums);
            System.out.println(candidates);
        }
    }
}
