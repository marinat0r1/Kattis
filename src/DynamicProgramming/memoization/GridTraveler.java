package DynamicProgramming.memoization;

/*
    Traveler on a 2D grid.
    Goal: Reach bottom-right corner.
    Rules: Only move down or right. Begin in top-left corner.
    Problem: In how many ways can you travel to the goal on a grid with dimension n * m?
**/

import javafx.util.Pair;

import java.util.HashMap;

public class GridTraveler {

    public static long gridTraveler(long n, long m) {
        if (n == 0 | m == 0) return 0;
        if (n == 1 & m == 1) return 1;
        return gridTraveler(n-1,m) + gridTraveler(n, m-1);
    }

    public static long dynamicGridTraveler(long n, long m, HashMap<Pair<Long,Long>, Long> memo) {
        if (memo.containsKey(new Pair<>(n,m))) return memo.get(new Pair<>(n,m)); // order does not matter
        if (memo.containsKey(new Pair<>(m,n))) return memo.get(new Pair<>(m,n));
        if (n == 0 | m == 0) return 0;
        if (n == 1 & m == 1) return 1;
        memo.put(new Pair<>(n,m),dynamicGridTraveler(n-1,m, memo) + dynamicGridTraveler(n, m-1, memo));
        memo.put(new Pair<>(m,n),dynamicGridTraveler(n-1,m, memo) + dynamicGridTraveler(n, m-1, memo));
        return memo.get(new Pair<>(n,m));
    }

    public static void main(String[] args) {

        System.out.println(dynamicGridTraveler(1,1, new HashMap<>()));
        System.out.println(dynamicGridTraveler(2,3, new HashMap<>()));
        System.out.println(dynamicGridTraveler(3,3, new HashMap<>()));
        System.out.println(dynamicGridTraveler(18,18, new HashMap<>()));

        System.out.println(gridTraveler(1,1));
        System.out.println(gridTraveler(2,3));
        System.out.println(gridTraveler(3,3));
        System.out.println(gridTraveler(18,18));
    }
}
