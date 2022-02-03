package week7;

import java.util.HashMap;
import java.util.Scanner;

public class HoneycombWalk {

    public static long[] result = new long[20];
    public static HashMap<String, Long> step = new HashMap<>();

    public static long walk(int x, int y, int n) {
        if (n == 0) {
            if (x == 0 & y == 0) return 1;
            else return 0;
        }
        String key1 = n + "," + x + "," + y;
        if (step.containsKey(key1)) return step.get(key1);
        long out = walk(x, y+1, n-1) + walk(x, y-1, n-1) + walk(x+1, y+1, n-1)
                + walk(x-1, y-1, n-1) + walk(x-1, y, n-1) + walk(x+1, y, n-1);
        String key2 = n + "," + x + "," + y;
        step.put(key2,out);
        return out;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 15; ++i) {
            result[i] = walk(0,0,i);
        }

        Scanner scanner = new Scanner(System.in);
        int run = scanner.nextInt();
        for (int i = 0; i < run; i++) {
            int n = scanner.nextInt();
            System.out.println(result[n]);
        }
    }
}
