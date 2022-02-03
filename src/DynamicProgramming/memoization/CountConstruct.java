package DynamicProgramming.memoization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountConstruct {

    public static int countConstruct (String targetString, ArrayList<String> components, HashMap<String, Integer> memo) {
        if (targetString.equals("")) return 1;
        if (memo.containsKey(targetString)) return memo.get(targetString);

        int totalCount = 0;

        for (String string : components) {
            if (targetString.startsWith(string)) {
                String[] suffix = targetString.split(string);
                if (suffix.length == 0) {
                    totalCount += 1;
                } else {
                    int numWays = countConstruct(suffix[suffix.length-1],components, memo);
                    totalCount += numWays;
                }

            }
        }
        memo.put(targetString,totalCount);
        return totalCount;
    }

    public static void main(String[] args) {

        System.out.println(countConstruct("abcdef", new ArrayList<>(Arrays.asList("ab","a","cd","c", "ef", "b")), new HashMap<>()));
        System.out.println(countConstruct("abcdef", new ArrayList<>(Arrays.asList("ab","a","cc","ccc")), new HashMap<>()));
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" +
                "                                  eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" +
                "                                  eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new ArrayList<>(Arrays.asList(
                "e","ee","eee","eeee", "eeeee", "eeeeee", "f", "ffff", "ef", "eeef")), new HashMap<>()));

    }
}
