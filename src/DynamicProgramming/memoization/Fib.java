package DynamicProgramming.memoization;

import java.util.HashMap;
import java.util.HashSet;

public class Fib {

    public static long fib(long n) {
        if (n <= 2) return 1;
        return fib(n-1) + fib(n-2);
    }

    // memoization
    public static long dynamicFib(long n, HashMap<Long,Long> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) return 1;
        memo.put(n,dynamicFib(n-1,memo) + dynamicFib(n-2,memo));
        return memo.get(n);
    }

    public static void main(String[] args) {
        long n = 50;
        System.out.println(dynamicFib(n, new HashMap<>()));
        System.out.println(fib(n));

    }
}
